package warehouse.services;

import warehouse.models.Product;
import warehouse.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    void deleteProductById(Integer productId);

    Optional<Product> getProductById(Integer productId);

    List<Product> findByTitle(String title);

    Integer countByProductId();

    List<Product> selectProductOverMinimumPrice(Integer price);

    void updateTitleAndPriceAndQuantityByProductId(String title, Integer price, Integer quantity, Integer productId);


}
