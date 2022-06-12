package com.ahmedelzubair.simplifiedlinkedin.addresses.service;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Continent;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto.ContinentDTO;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.mapper.ContinentMapper;
import com.ahmedelzubair.simplifiedlinkedin.addresses.repo.ContinentJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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

        Continent continent = continentMapper.mapToContinentEntity(continentDTO);

        Optional<Continent> continentOptional = continentJpaRepo.findById(continent.getId());

        if (continentOptional.isEmpty()) {
            throw new EntityNotFoundException("Continent with id " + continent.getId()
                    + " does not exist");
        }

        Continent updatedContinent = continentJpaRepo.save(continent);

        return continentMapper.mapToContinentDTO(updatedContinent);
    }

    @Override
    public void deleteContinent(ContinentDTO continentDTO) {

        Continent continent = continentMapper.mapToContinentEntity(continentDTO);

        Optional<Continent> continentOptional = continentJpaRepo.findById(continent.getId());

        if (continentOptional.isEmpty()) {
            throw new EntityNotFoundException("Continent with id " + continent.getId()
                    + " does not exist");
        }

        continentJpaRepo.delete(continent);

    }

    @Override
    public Optional<ContinentDTO> findContinentById(Long continentId) {
        Optional<Continent> continentOptional = continentJpaRepo.findById(continentId);
        if (continentOptional.isEmpty()) {
            throw new EntityNotFoundException("Continent with id " + continentId
                    + " does not exist");
        }
        return Optional.of(continentMapper.mapToContinentDTO(continentOptional.get()));
    }

    @Override
    public Optional<ContinentDTO> findContinentByName(String continentName) {
        Optional<Continent> continentOptional = continentJpaRepo.findByName(continentName);
        if (continentOptional.isEmpty()) {
            throw new EntityNotFoundException("Continent with name " + continentName
                    + " does not exist");
        }
        return Optional.of(continentMapper.mapToContinentDTO(continentOptional.get()));
    }
}
