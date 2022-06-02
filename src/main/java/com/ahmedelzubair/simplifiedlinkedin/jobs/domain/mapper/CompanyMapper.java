package com.ahmedelzubair.simplifiedlinkedin.jobs.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.Company;
import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.dto.CompanyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDTO mapToDTO(Company company);

    Company mapToEntity(CompanyDTO companyDTO);


}
