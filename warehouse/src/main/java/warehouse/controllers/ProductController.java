package warehouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entities.ProductEntity;
import warehouse.services.ProductService;

@RestController
@RequestMapping("/product/")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("{product_id}")
    void deleteProductById(@PathVariable("product_id") Integer productId) {
        productService.deleteProductById(productId);
    }

}
