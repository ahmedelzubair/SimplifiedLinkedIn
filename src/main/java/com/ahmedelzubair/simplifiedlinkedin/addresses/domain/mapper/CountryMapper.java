package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CountryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);


    CountryDTO mapToCountryDTO(Country country);

    Country mapToCountryEntity(CountryDTO countryDTO);
}
