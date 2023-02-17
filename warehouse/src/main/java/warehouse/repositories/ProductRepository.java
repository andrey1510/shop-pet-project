package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.entities.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
}