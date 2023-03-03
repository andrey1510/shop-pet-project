package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.exceptions.CustomerNotFoundException;
import warehouse.models.Customer;
import warehouse.services.CustomerService;

import java.util.Optional;

@RestController
@RequestMapping("/api/customer/")
@RequiredArgsConstructor
@Tag(name = "customer_operations", description = "Customer controller of Warehouse service")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping("{customer_id}")
    void deleteCustomerById(@PathVariable("customer_id") Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping("{customer_id}")
    @Tag(name = "get_customer_by_id")
    public Optional<Customer> getCustomerById(@PathVariable("customer_id") Integer customerId) {
        return Optional.ofNullable(customerService.getCustomerById(customerId)
                .orElseThrow(CustomerNotFoundException::new));
    }

}
