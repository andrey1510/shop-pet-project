package warehouse.services;

import warehouse.models.Address;
import java.util.Optional;

public interface AddressService {

    Address createAddress(Address address);

    void deleteAddressById(Integer addressId);

    Optional<Address> getAddressById(Integer addressId);

}
