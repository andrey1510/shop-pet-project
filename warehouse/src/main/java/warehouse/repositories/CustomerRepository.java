package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}