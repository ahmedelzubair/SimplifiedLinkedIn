package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityJpaRepo extends JpaRepository<City, Long> {


}
