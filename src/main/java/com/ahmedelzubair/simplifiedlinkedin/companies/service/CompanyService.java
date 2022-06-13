package com.ahmedelzubair.simplifiedlinkedin.companies.service;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.dto.CompanyDTO;

import java.util.Optional;

public interface CompanyService {

    CompanyDTO createCompany(CompanyDTO companyDTO);

    CompanyDTO updateCompany(CompanyDTO companyDTO);

    void deleteCompany(CompanyDTO companyDTO);

    Optional<CompanyDTO> findCompanyById(Long companyId);


    Optional<CompanyDTO> findCompanyByName(String companyName);
}
