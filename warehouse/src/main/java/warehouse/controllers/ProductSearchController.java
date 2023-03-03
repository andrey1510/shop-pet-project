package warehouse.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import warehouse.models.Product;
import warehouse.repositories.ProductRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product_search")
public class ProductSearchController {

    private final ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE },
            value = "/api/product_search/{title}")
    public ResponseEntity<List<Product>> findByTitle(@PathVariable("title") String title) {
          List<Product> product = productRepository.findByTitle(title);
          return ResponseEntity.status(HttpStatus.OK).body(product);
    }



}
