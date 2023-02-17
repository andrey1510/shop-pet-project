package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.entities.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer> {
}