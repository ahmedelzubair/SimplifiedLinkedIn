package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;

import java.util.Optional;

public interface ContinentService {

    ContinentDTO createContinent(ContinentDTO continentDTO);

    ContinentDTO updateContinent(ContinentDTO continentDTO);

    void deleteContinent(ContinentDTO continentDTO);

    Optional<ContinentDTO> findContinentById(Long continentId);

    Optional<ContinentDTO> findContinentByName(String continentName);


}
