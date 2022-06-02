package com.ahmedelzubair.simplifiedlinkedin.companies.repo;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyJpaRepo extends JpaRepository<Company, Long> {
}
