package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper.ContinentMapper;
import com.ahmedelzubair.simplifiedlinkedin.addresses.repo.ContinentJpaRepo;

import java.util.Optional;

public class ContinentServiceImpl implements ContinentService {

    private final ContinentJpaRepo continentJpaRepo;
    private final ContinentMapper continentMapper;

    public ContinentServiceImpl(ContinentJpaRepo continentJpaRepo) {
        this.continentJpaRepo = continentJpaRepo;
        this.continentMapper = ContinentMapper.INSTANCE;
    }


    @Override
    public ContinentDTO createContinent(ContinentDTO continentDTO) {

        Continent continent = continentMapper.mapToContinentEntity(continentDTO);

        if (continentJpaRepo.findByName(continent.getName()).isPresent()) {
            throw new IllegalArgumentException("Continent with name " + continent.getName() + " already exists");
        }
        continentJpaRepo.save(continent);
        return continentMapper.mapToContinentDTO(continent);
    }

    @Override
    public ContinentDTO updateContinent(ContinentDTO continentDTO) {
        return null;
    }

    @Override
    public void deleteContinent(ContinentDTO continentDTO) {

    }

    @Override
    public Optional<ContinentDTO> findContinentById(Long continentId) {
        return Optional.empty();
    }

    @Override
    public Optional<ContinentDTO> findContinentByName(String continentName) {
        return Optional.empty();
    }
}
