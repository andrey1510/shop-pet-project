package warehouse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import warehouse.models.Product;
import warehouse.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Optional<Product> getProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    @Override
    public List<Product> findByTitle(String title) {
        return productRepository.findByTitle(title);
    };

    @Override
    public Integer countByProductId(){
        return productRepository.countByProductId();
    }

    @Override
    public List<Product> selectProductOverMinimumPrice(Integer price) {
        return productRepository.selectProductOverMinimumPrice(price);
    }
    @Override
    public Product updateTitleAndPriceAndQuantityByProductId(String title, Integer price, Integer quantity, Integer productId) {
        productRepository.updateTitleAndPriceAndQuantityByProductId(title, price, quantity, productId);
    }

}
