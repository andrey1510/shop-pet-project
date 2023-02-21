package warehouse.services;

import warehouse.models.Product;

public interface ProductService {

    Product createProduct(Product product);

    void deleteProductById(Integer productId);

}
