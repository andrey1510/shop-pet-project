package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Address;
import warehouse.models.Customer;
import warehouse.services.AddressService;

import java.util.Optional;

@RestController
@RequestMapping("/api/address/")
@RequiredArgsConstructor
@Tag(name = "address_operations", description = "All operations with AddressController of Warehouse service")
public class AddressController {

    private final AddressService addressService;

    ////////////////// not working ////////////////////


    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @DeleteMapping("{address_id}")
    void deleteAddressById(@PathVariable("address_id") Integer addressId) {
        addressService.deleteAddressById(addressId);
    }

    @GetMapping("{address_id}")
    public Optional<Address> getAddressById(@PathVariable("address_id") Integer addressId) {
        return addressService.getAddressById(addressId);
    }

}
