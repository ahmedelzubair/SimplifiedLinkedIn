package com.ahmedelzubair.simplifiedlinkedin.address.repo;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJpaRepo extends JpaRepository<Country, Long> {


}
