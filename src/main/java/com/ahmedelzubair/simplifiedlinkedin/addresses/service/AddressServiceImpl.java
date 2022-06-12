package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Address;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.AddressDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper.AddressMapper;
import com.ahmedelzubair.simplifiedlinkedin.addresses.repo.AddressJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressJpaRepo addressJpaRepo;
    private final AddressMapper addressMapper;

    public AddressServiceImpl(AddressJpaRepo addressJpaRepo) {
        this.addressJpaRepo = addressJpaRepo;
        this.addressMapper = AddressMapper.INSTANCE;
    }


    @Override
    public AddressDTO createAddress(AddressDTO addressDTO) {

        Address address = addressMapper.mapToEntity(addressDTO);

        if (addressJpaRepo.findByStreetAndCityAndZipCodeAndCountry(address.getStreet(), address.getCity(), address.getZipCode(), address.getCountry()).isPresent()) {
            throw new IllegalArgumentException("Address with zipCode " + address.getZipCode() + " already exists");
        }
        addressJpaRepo.save(address);
        return addressMapper.mapToDTO(address);
    }

    @Override
    public AddressDTO updateAddress(AddressDTO addressDTO) {

        Address address = addressMapper.mapToEntity(addressDTO);

        Optional<Address> addressOptional = addressJpaRepo.findById(address.getId());

        if (addressOptional.isEmpty()) {
            throw new EntityNotFoundException("Address with id " + address.getId()
                    + " does not exist");
        }

        Address updatedAddress = addressJpaRepo.save(address);

        return addressMapper.mapToDTO(updatedAddress);
    }

    @Override
    public void deleteAddress(AddressDTO addressDTO) {

        Address address = addressMapper.mapToEntity(addressDTO);

        Optional<Address> addressOptional = addressJpaRepo.findById(address.getId());

        if (addressOptional.isEmpty()) {
            throw new EntityNotFoundException("Address with id " + address.getId()
                    + " does not exist");
        }

        addressJpaRepo.delete(address);

    }

    @Override
    public Optional<AddressDTO> findAddressById(Long addressId) {
        Optional<Address> addressOptional = addressJpaRepo.findById(addressId);
        if (addressOptional.isEmpty()) {
            throw new EntityNotFoundException("Address with id " + addressId
                    + " does not exist");
        }
        return Optional.of(addressMapper.mapToDTO(addressOptional.get()));
    }

//    @Override
//    public Optional<AddressDTO> findAddressByUserId(Long userId) {
//        Optional<Address> addressOptional = addressJpaRepo.findByUserId(userId);
//        if (addressOptional.isEmpty()) {
//            throw new EntityNotFoundException("Address with name " + userId
//                    + " does not exist");
//        }
//        return Optional.of(addressMapper.mapToDTO(addressOptional.get()));
//    }


}
