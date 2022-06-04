package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CountryDTO;

import java.util.Optional;

public interface CountryService {

    void createCountry(CountryDTO country);

    CountryDTO updateCountry(CountryDTO country);

    void deleteCountry(CountryDTO country);

    Optional<CountryDTO> findCountryById(Long countryId);


}
