package com.ahmedelzubair.simplifiedlinkedin.address.service;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.dto.CityDTO;

import java.util.Optional;

public interface CityService {

    void createCity(CityDTO city);

    CityDTO updateCity(CityDTO city);

    void deleteCity(CityDTO city);

    Optional<CityDTO> findCityById(Long cityId);


}
