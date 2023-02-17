package warehouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entities.CustomerEntity;
import warehouse.services.CustomerService;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("{customer_id}")
    void deleteCustomerById(@PathVariable("customer_id") Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }

}
