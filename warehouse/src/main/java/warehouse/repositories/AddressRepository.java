package warehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Address;

import java.util.List;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Integer> {

    List<Address> findByCity(String city);
    List<Address> findByCountry(String country);

}