package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContinentJpaRepo extends JpaRepository<Continent, Long> {
    Optional<Continent> findByName(String name);


}
