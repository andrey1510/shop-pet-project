package warehouse.services;

import warehouse.models.Product;
import warehouse.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    void deleteProductById(Integer productId);

    Optional<Product> getProductById(Integer productId);

}
