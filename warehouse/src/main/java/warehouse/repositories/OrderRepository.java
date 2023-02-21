package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.models.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}