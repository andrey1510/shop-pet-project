package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import warehouse.models.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}