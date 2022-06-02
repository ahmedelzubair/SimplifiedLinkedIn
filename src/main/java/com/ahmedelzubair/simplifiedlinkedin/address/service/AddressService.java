package com.ahmedelzubair.simplifiedlinkedin.address.service;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.AddressDTO;

import java.util.Optional;

public interface AddressService {

    void createAddress(AddressDTO addressDTO);

    AddressDTO updateAddress(AddressDTO addressDTO);

    void deleteAddress(AddressDTO addressDTO);

    Optional<AddressDTO> findAddressById(Long addressId);


}
