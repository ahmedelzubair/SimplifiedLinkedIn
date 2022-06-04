package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJpaRepo extends JpaRepository<Country, Long> {


}
