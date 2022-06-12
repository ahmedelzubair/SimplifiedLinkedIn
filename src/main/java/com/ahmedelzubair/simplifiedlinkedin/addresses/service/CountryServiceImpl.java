package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CountryDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper.CountryMapper;
import com.ahmedelzubair.simplifiedlinkedin.addresses.repo.CountryJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryJpaRepo countryJpaRepo;
    private final CountryMapper countryMapper;

    public CountryServiceImpl(CountryJpaRepo countryJpaRepo) {
        this.countryJpaRepo = countryJpaRepo;
        this.countryMapper = CountryMapper.INSTANCE;
    }


    @Override
    public CountryDTO createCountry(CountryDTO countryDTO) {

        Country country = countryMapper.mapToCountryEntity(countryDTO);

        if (countryJpaRepo.findByName(country.getName()).isPresent()) {
            throw new IllegalArgumentException("Country with name " + country.getName() + " already exists");
        }
        countryJpaRepo.save(country);
        return countryMapper.mapToCountryDTO(country);
    }

    @Override
    public CountryDTO updateCountry(CountryDTO countryDTO) {

        Country country = countryMapper.mapToCountryEntity(countryDTO);

        Optional<Country> countryOptional = countryJpaRepo.findById(country.getId());

        if (countryOptional.isEmpty()) {
            throw new EntityNotFoundException("Country with id " + country.getId()
                    + " does not exist");
        }

        Country updatedCountry = countryJpaRepo.save(country);

        return countryMapper.mapToCountryDTO(updatedCountry);
    }

    @Override
    public void deleteCountry(CountryDTO countryDTO) {

        Country country = countryMapper.mapToCountryEntity(countryDTO);

        Optional<Country> countryOptional = countryJpaRepo.findById(country.getId());

        if (countryOptional.isEmpty()) {
            throw new EntityNotFoundException("Country with id " + country.getId()
                    + " does not exist");
        }

        countryJpaRepo.delete(country);

    }

    @Override
    public Optional<CountryDTO> findCountryById(Long countryId) {
        Optional<Country> countryOptional = countryJpaRepo.findById(countryId);
        if (countryOptional.isEmpty()) {
            throw new EntityNotFoundException("Country with id " + countryId
                    + " does not exist");
        }
        return Optional.of(countryMapper.mapToCountryDTO(countryOptional.get()));
    }

    @Override
    public Optional<CountryDTO> findCountryByName(String countryName) {
        Optional<Country> countryOptional = countryJpaRepo.findByName(countryName);
        if (countryOptional.isEmpty()) {
            throw new EntityNotFoundException("Country with name " + countryName
                    + " does not exist");
        }
        return Optional.of(countryMapper.mapToCountryDTO(countryOptional.get()));
    }


}
