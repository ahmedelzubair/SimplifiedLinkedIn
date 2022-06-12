package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CityDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper.CityMapper;
import com.ahmedelzubair.simplifiedlinkedin.addresses.repo.CityJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    private final CityJpaRepo cityJpaRepo;
    private final CityMapper cityMapper;

    public CityServiceImpl(CityJpaRepo cityJpaRepo) {
        this.cityJpaRepo = cityJpaRepo;
        this.cityMapper = CityMapper.INSTANCE;
    }


    @Override
    public CityDTO createCity(CityDTO cityDTO) {

        City city = cityMapper.mapToCityEntity(cityDTO);

        if (cityJpaRepo.findByName(city.getName()).isPresent()) {
            throw new IllegalArgumentException("City with name " + city.getName() + " already exists");
        }
        cityJpaRepo.save(city);
        return cityMapper.mapToCityDTO(city);
    }

    @Override
    public CityDTO updateCity(CityDTO cityDTO) {

        City city = cityMapper.mapToCityEntity(cityDTO);

        Optional<City> cityOptional = cityJpaRepo.findById(city.getId());

        if (cityOptional.isEmpty()) {
            throw new EntityNotFoundException("City with id " + city.getId()
                    + " does not exist");
        }

        City updatedCity = cityJpaRepo.save(city);

        return cityMapper.mapToCityDTO(updatedCity);
    }

    @Override
    public void deleteCity(CityDTO cityDTO) {

        City city = cityMapper.mapToCityEntity(cityDTO);

        Optional<City> cityOptional = cityJpaRepo.findById(city.getId());

        if (cityOptional.isEmpty()) {
            throw new EntityNotFoundException("City with id " + city.getId()
                    + " does not exist");
        }

        cityJpaRepo.delete(city);

    }

    @Override
    public Optional<CityDTO> findCityById(Long cityId) {
        Optional<City> cityOptional = cityJpaRepo.findById(cityId);
        if (cityOptional.isEmpty()) {
            throw new EntityNotFoundException("City with id " + cityId
                    + " does not exist");
        }
        return Optional.of(cityMapper.mapToCityDTO(cityOptional.get()));
    }

    @Override
    public Optional<CityDTO> findCityByName(String cityName) {
        Optional<City> cityOptional = cityJpaRepo.findByName(cityName);
        if (cityOptional.isEmpty()) {
            throw new EntityNotFoundException("City with name " + cityName
                    + " does not exist");
        }
        return Optional.of(cityMapper.mapToCityDTO(cityOptional.get()));
    }


}
