package com.ahmedelzubair.simplifiedlinkedin.companies.service;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.dto.CompanyDTO;

public interface CompanyService {

    void createCompany(CompanyDTO companyDTO);

    void updateCompany(CompanyDTO companyDTO);

    void deleteCompany(CompanyDTO companyDTO);

    CompanyDTO getCompany(String companyId);


}
