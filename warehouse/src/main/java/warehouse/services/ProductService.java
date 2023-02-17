package warehouse.services;

import warehouse.entities.ProductEntity;

public interface ProductService {

    ProductEntity createProduct(ProductEntity product);

    void deleteProductById(Integer productId);

}
