package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CountryDTO;

import java.util.Optional;

public interface CountryService {

    CountryDTO createCountry(CountryDTO country);

    CountryDTO updateCountry(CountryDTO country);

    void deleteCountry(CountryDTO country);

    Optional<CountryDTO> findCountryById(Long countryId);


    Optional<CountryDTO> findCountryByName(String countryName);
}
