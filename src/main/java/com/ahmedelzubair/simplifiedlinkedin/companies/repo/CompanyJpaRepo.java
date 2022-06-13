package com.ahmedelzubair.simplifiedlinkedin.companies.repo;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyJpaRepo extends JpaRepository<Company, Long> {
    Optional<Company> findByName(String companyName);
}
