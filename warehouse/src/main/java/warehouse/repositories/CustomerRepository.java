package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.entities.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
}