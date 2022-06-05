package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    CityDTO mapToCityDTO(City city);

    City mapToCityEntity(CityDTO cityDTO);

}
