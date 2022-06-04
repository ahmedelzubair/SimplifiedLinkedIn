package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.AddressDTO;

import java.util.Optional;

public interface AddressService {

    void createAddress(AddressDTO addressDTO);

    AddressDTO updateAddress(AddressDTO addressDTO);

    void deleteAddress(AddressDTO addressDTO);

    Optional<AddressDTO> findAddressById(Long addressId);


}
