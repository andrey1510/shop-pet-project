package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Product;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer> {
}