package warehouse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Address;
import warehouse.models.Customer;

import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends CrudRepository<Address, Integer> {

    List<Address> findByCity(String city);
    List<Address> findByCountry(String country);

}