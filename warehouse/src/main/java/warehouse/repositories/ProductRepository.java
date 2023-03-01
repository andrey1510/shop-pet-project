package warehouse.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Address;
import warehouse.models.Product;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByTitle(String title);

    @Query(value = "SELECT * FROM product WHERE price > :price", nativeQuery = true)
    List<Product> selectProductOverMinimumPrice(@Param("price") Integer price);


}