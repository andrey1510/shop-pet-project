package warehouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import warehouse.models.Customer;
import java.util.List;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByFirstNameAndLastNameOrderByLastNameDesc(String firstName, String lastName);
    List<Customer> findByFirstNameOrLastNameIgnoreCase(String firstName, String lastName);
    List<Customer> findByPhone(String phone);
    List<Customer> findByEmail(String email);

    @Query(value = "SELECT * FROM customer WHERE first_name = :firstName AND balance > :balance", nativeQuery = true)
    List<Customer> selectCustomerByLastNameAndOverMinimumBalance(@Param("firstName") String firstName, @Param("balance") Integer balance);

}