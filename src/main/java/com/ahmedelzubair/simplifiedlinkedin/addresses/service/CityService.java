package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.CityDTO;

import java.util.Optional;

public interface CityService {

    CityDTO createCity(CityDTO city);

    CityDTO updateCity(CityDTO city);

    void deleteCity(CityDTO city);

    Optional<CityDTO> findCityById(Long cityId);


    Optional<CityDTO> findCityByName(String cityName);
}
