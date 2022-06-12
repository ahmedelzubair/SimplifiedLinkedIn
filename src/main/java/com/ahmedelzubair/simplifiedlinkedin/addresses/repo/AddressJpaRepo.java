package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Address;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressJpaRepo extends JpaRepository<Address, Long> {


    Optional<Object> findByStreetAndCityAndZipCodeAndCountry
            (String street, City city, String zipCode, Country country);

}
