package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Address;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper extends ContinentMapper, CountryMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO mapToDTO(Address address);

    Address mapToEntity(AddressDTO addressDTO);


}
