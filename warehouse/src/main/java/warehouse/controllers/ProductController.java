package warehouse.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Product;
import warehouse.services.ProductService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product/")
@RequiredArgsConstructor
@Tag(name = "product_operations", description = "All operations with ProductController of Warehouse service")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @Operation(description = "Fill in new product.")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("{product_id}")
    @Operation(description = "Delete product by its ID.")
    void deleteProductById(@PathVariable("product_id") Integer productId) {
        productService.deleteProductById(productId);
    }

    @GetMapping("{product_id}")
    @Operation(description = "Get product by its ID.")
//            responses = {
//                    @ApiResponse(responseCode = "200", description = "Product found"),
//                    @ApiResponse(responseCode = "404", description = "Product not found")}

    public Optional<Product> getProductById(@PathVariable("product_id") Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("count_products")
    @Operation(description = "Count all products.")
    public Integer countByProductId(){
        return productService.countByProductId();
    }

    @GetMapping("find_products/{title}")
    @Operation(description = "Find all products with indicated title.")
    public List<Product> findByTitle(@PathVariable("title") String title) {
        return productService.findByTitle(title);
    }

    @GetMapping("find_expensive_products")
    @Schema(description = "Find all products which exceed indicated price.")
    public List<Product> selectProductOverMinimumPrice(Integer price) {
        return productService.selectProductOverMinimumPrice(price);
    }

    @PutMapping("{product_id}")
    @Operation(description = "Update a product.")
    public void updateTitleAndPriceAndQuantityByProductId (
            @PathVariable("product_id") Integer productId, @RequestBody Product product) {
        productService.updateTitleAndPriceAndQuantityByProductId(product.getTitle(), product.getPrice(), product.getQuantity(), productId);
    }

  //  public void updateTitleAndPriceAndQuantityByProductId(String title, Integer price, Integer quantity, Integer productId) {
   //     productRepository.updateTitleAndPriceAndQuantityByProductId(title, price, quantity, productId);


}
