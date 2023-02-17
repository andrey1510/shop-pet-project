package warehouse.services;

import warehouse.entities.AddressEntity;

public interface AddressService {

    AddressEntity createAddress(AddressEntity address);

    void deleteAddressById(Integer addressId);

}
