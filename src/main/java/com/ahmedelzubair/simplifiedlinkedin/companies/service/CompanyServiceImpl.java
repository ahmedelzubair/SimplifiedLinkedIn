package com.ahmedelzubair.simplifiedlinkedin.companies.service;


import com.ahmedelzubair.simplifiedlinkedin.companies.domain.Company;
import com.ahmedelzubair.simplifiedlinkedin.companies.domain.dto.CompanyDTO;
import com.ahmedelzubair.simplifiedlinkedin.companies.domain.mapper.CompanyMapper;
import com.ahmedelzubair.simplifiedlinkedin.companies.repo.CompanyJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyJpaRepo companyJpaRepo;
    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyJpaRepo companyJpaRepo) {
        this.companyJpaRepo = companyJpaRepo;
        this.companyMapper = CompanyMapper.INSTANCE;
    }


    @Override
    public CompanyDTO createCompany(CompanyDTO companyDTO) {

        Company company = companyMapper.mapToEntity(companyDTO);

        companyJpaRepo.save(company);
        return companyMapper.mapToDTO(company);
    }

    @Override
    public CompanyDTO updateCompany(CompanyDTO companyDTO) {

        Company company = companyMapper.mapToEntity(companyDTO);

        Optional<Company> companyOptional = companyJpaRepo.findById(company.getId());

        if (companyOptional.isEmpty()) {
            throw new EntityNotFoundException("Company with id " + company.getId()
                    + " does not exist");
        }

        Company updatedCompany = companyJpaRepo.save(company);

        return companyMapper.mapToDTO(updatedCompany);
    }

    @Override
    public void deleteCompany(CompanyDTO companyDTO) {

        Company company = companyMapper.mapToEntity(companyDTO);

        Optional<Company> companyOptional = companyJpaRepo.findById(company.getId());

        if (companyOptional.isEmpty()) {
            throw new EntityNotFoundException("Company with id " + company.getId()
                    + " does not exist");
        }

        companyJpaRepo.delete(company);
    }

    @Override
    public Optional<CompanyDTO> findCompanyById(Long companyId) {
        Optional<Company> companyOptional = companyJpaRepo.findById(companyId);
        if (companyOptional.isEmpty()) {
            throw new EntityNotFoundException("Company with id " + companyId
                    + " does not exist");
        }
        return Optional.of(companyMapper.mapToDTO(companyOptional.get()));
    }

    @Override
    public Optional<CompanyDTO> findCompanyByName(String companyName) {
        Optional<Company> companyOptional = companyJpaRepo.findByName(companyName);
        if (companyOptional.isEmpty()) {
            throw new EntityNotFoundException("Company with name " + companyName
                    + " does not exist");
        }
        return Optional.of(companyMapper.mapToDTO(companyOptional.get()));
    }


}
