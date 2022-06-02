package com.ahmedelzubair.simplifiedlinkedin.address.repo;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentJpaRepo extends JpaRepository<Continent, Long> {


}
