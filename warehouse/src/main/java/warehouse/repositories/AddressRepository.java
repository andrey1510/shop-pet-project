package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Address;

@Repository
@Transactional
public interface AddressRepository extends CrudRepository<Address, Integer> {
}