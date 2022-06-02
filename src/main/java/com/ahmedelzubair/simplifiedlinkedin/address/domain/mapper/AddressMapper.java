package com.ahmedelzubair.simplifiedlinkedin.address.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Address;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.Continent;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.Country;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.AddressDTO;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.CityDTO;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.ContinentDTO;
import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.CountryDTO;
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
