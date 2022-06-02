package com.ahmedelzubair.simplifiedlinkedin.address.repo;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityJpaRepo extends JpaRepository<City, Long> {


}
