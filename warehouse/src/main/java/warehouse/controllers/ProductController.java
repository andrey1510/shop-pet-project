package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Product;
import warehouse.services.ProductService;

@RestController
@RequestMapping("/product/")
@Tag(name = "Product operations", description = "Product controller of Warehouse service")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("{product_id}")
    void deleteProductById(@PathVariable("product_id") Integer productId) {
        productService.deleteProductById(productId);
    }

}
