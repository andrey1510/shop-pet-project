package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Product;
import warehouse.services.ProductService;
import java.util.Optional;

@RestController
@RequestMapping("/api/product/")
@RequiredArgsConstructor
@Tag(name = "Product operations", description = "Product controller of Warehouse service")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("{product_id}")
    void deleteProductById(@PathVariable("product_id") Integer productId) {
        productService.deleteProductById(productId);
    }

    @GetMapping("{product_id}")
    public Optional<Product> getProductById(@PathVariable("product_id") Integer productId) {
        return productService.getProductById(productId);
    }





}
