package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}