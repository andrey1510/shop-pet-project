package warehouse.services;

import org.springframework.web.bind.annotation.GetMapping;
import warehouse.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    void deleteCustomerById(Integer customerId);

    Optional<Customer> getCustomerById(Integer customerId);

    List<Customer> findALlCustomers();

    Integer countByCustomerId();


}
