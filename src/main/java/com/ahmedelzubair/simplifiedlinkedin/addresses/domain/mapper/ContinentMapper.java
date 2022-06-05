package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContinentMapper {
    ContinentMapper INSTANCE = Mappers.getMapper(ContinentMapper.class);

    ContinentDTO mapToContinentDTO(Continent continent);

    Continent mapToContinentEntity(ContinentDTO continentDTO);
}
