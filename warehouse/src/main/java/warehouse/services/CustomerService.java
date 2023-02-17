package warehouse.services;

import warehouse.entities.CustomerEntity;

public interface CustomerService {

    CustomerEntity createCustomer(CustomerEntity customer);

    void deleteCustomerById(Integer customerId);

}
