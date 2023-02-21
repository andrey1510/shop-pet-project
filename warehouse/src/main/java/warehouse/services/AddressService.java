package warehouse.services;

import warehouse.models.Address;

public interface AddressService {

    Address createAddress(Address address);

    void deleteAddressById(Integer addressId);

}
