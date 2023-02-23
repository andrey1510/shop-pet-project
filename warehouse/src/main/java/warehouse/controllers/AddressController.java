package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Address;
import warehouse.services.AddressService;

@RestController
@RequestMapping("/address/")
@Tag(name = "Address operations", description = "Address controller of Warehouse service")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @DeleteMapping("{address_id}")
    void deleteAddressById(@PathVariable("address_id") Integer addressId) {
        addressService.deleteAddressById(addressId);
    }

}
