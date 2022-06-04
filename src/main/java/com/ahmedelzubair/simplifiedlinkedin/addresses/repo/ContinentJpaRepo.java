package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentJpaRepo extends JpaRepository<Continent, Long> {


}
