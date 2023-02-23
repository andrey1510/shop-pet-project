package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.exceptions.CustomerNotFoundException;
import warehouse.models.Customer;
import warehouse.services.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/customer/")
@Tag(name = "Customer operations", description = "Customer controller of Warehouse service")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("{customer_id}")
    void deleteCustomerById(@PathVariable("customer_id") Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping("{customer_id}")
    public Optional<Customer> getCustomerById(@PathVariable("customer_id") Integer customerId) {
        return Optional.ofNullable(customerService.getCustomerById(customerId)
                .orElseThrow(CustomerNotFoundException::new));
    }


}
