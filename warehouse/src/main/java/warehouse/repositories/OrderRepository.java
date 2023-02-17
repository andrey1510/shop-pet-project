package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.entities.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}