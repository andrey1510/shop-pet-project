package warehouse.services;

import warehouse.models.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    void deleteCustomerById(Integer customerId);

    Optional<Customer> getCustomerById(Integer customerId);


}
