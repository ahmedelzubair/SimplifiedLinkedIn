package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;

public interface ContinentService {

    ContinentDTO createContinent(ContinentDTO continentDTO);

    ContinentDTO updateContinent(ContinentDTO continentDTO);

    void deleteContinent(ContinentDTO continentDTO);

    void deleteContinentById(Long id);

    ContinentDTO findContinentById(Long continentId);

    ContinentDTO findContinentByName(String continentName);


}
