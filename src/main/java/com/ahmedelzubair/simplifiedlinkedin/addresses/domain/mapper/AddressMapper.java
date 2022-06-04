package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Address;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.AddressDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CityDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CountryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO mapToDTO(Address address);

    Address mapToEntity(AddressDTO addressDTO);

    CityDTO mapToCityDTO(City city);

    City mapToCityEntity(CityDTO cityDTO);

    CountryDTO mapToCountryDTO(Country country);

    Country mapToCountryEntity(CountryDTO countryDTO);

    ContinentDTO mapToContinentDTO(Continent continent);

    Continent mapToContinentEntity(ContinentDTO continentDTO);


}
