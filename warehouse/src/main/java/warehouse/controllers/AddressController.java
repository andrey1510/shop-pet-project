package warehouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entities.AddressEntity;
import warehouse.services.AddressService;

import java.util.Optional;

@RestController
@RequestMapping("/address/")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public AddressEntity createAddress(@RequestBody AddressEntity address) {
        return addressService.createAddress(address);
    }

    @DeleteMapping("{address_id}")
    void deleteAddressById(@PathVariable("address_id") Integer addressId) {
        addressService.deleteAddressById(addressId);
    }

}
