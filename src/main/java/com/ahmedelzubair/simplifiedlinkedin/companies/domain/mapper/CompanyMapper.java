package com.ahmedelzubair.simplifiedlinkedin.companies.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.Company;
import com.ahmedelzubair.simplifiedlinkedin.companies.domain.dto.CompanyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDTO mapToDTO(Company company);

    Company mapToEntity(CompanyDTO companyDTO);


}
