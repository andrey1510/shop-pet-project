package warehouse.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Customer;

import java.util.List;

@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);

//    @Query(value = "SELECT * FROM customer WHERE first_name = :firstName AND customer_id > :customerId", nativeQuery = true)
//    List<Customer> selectCustomerByLastNameAndOverMinimumBalance(
//            @Param("firstName") String firstName,
//            @Param("balance") Integer balance);

}