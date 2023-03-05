package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.exceptions.CustomerNotFoundException;
import warehouse.models.Customer;
import warehouse.services.CustomerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer/")
@RequiredArgsConstructor
@Tag(name = "customer_operations", description = "All operations with CustomerController of Warehouse service")
public class CustomerController {

    private final CustomerService customerService;

    @DeleteMapping("{customer_id}")
    void deleteCustomerById(@PathVariable("customer_id") Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping("count_customers")
    public Integer countByCustomerId(){
        return customerService.countByCustomerId();
    }


    // not working //////////////////////////////

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }


    @GetMapping
    public List<Customer> findALlCustomers(){
        return customerService.findALlCustomers();
    }

    @GetMapping("{customer_id}")
    public Optional<Customer> getCustomerById(@PathVariable("customer_id") Integer customerId) {
        return Optional.ofNullable(customerService.getCustomerById(customerId)
                .orElseThrow(CustomerNotFoundException::new));
    }




}
