package warehouse.services;

import warehouse.models.Address;
import warehouse.models.Product;

import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    void deleteProductById(Integer productId);

    Optional<Product> getProductById(Integer productId);

}
