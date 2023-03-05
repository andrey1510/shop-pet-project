package warehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Product;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByTitle(String title);

    @Query(value = "SELECT * FROM product WHERE price > :price", nativeQuery = true)
    List<Product> selectProductOverMinimumPrice(@Param("price") Integer price);

    @Query(value = "SELECT COUNT(product_id) FROM product", nativeQuery = true)
    Integer countByProductId();

    @Modifying
    @Query("update Product p set p.title = :title, p.price = :price, p.quantity = :quantity where p.productId = :productId")
    void updateTitleAndPriceAndQuantityByProductId(String title, Integer price, Integer quantity, Integer productId);



}