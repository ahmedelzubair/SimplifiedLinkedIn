package com.ahmedelzubair.simplifiedlinkedin.contact_info.service;

import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.UserContactInfo;
import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.dto.UserContactInfoDTO;
import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.mapper.UserContactInfoMapper;
import com.ahmedelzubair.simplifiedlinkedin.contact_info.repo.UserContactInfoJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserContactInfoServiceImpl implements UserContactInfoService {

    private final UserContactInfoJpaRepo userContactInfoJpaRepo;
    private final UserContactInfoMapper userContactInfoMapper;

    public UserContactInfoServiceImpl(UserContactInfoJpaRepo userContactInfoJpaRepo) {
        this.userContactInfoJpaRepo = userContactInfoJpaRepo;
        this.userContactInfoMapper = UserContactInfoMapper.INSTANCE;
    }


    @Override
    public UserContactInfoDTO createUserContactInfo(UserContactInfoDTO userContactInfoDTO) {

        UserContactInfo userContactInfo = userContactInfoMapper.mapToEntity(userContactInfoDTO);

        userContactInfoJpaRepo.save(userContactInfo);
        return userContactInfoMapper.mapToDTO(userContactInfo);
    }

    @Override
    public UserContactInfoDTO updateUserContactInfo(UserContactInfoDTO userContactInfoDTO) {

        UserContactInfo userContactInfo = userContactInfoMapper.mapToEntity(userContactInfoDTO);

        Optional<UserContactInfo> userContactInfoOptional = userContactInfoJpaRepo.findById(userContactInfo.getId());

        if (userContactInfoOptional.isEmpty()) {
            throw new EntityNotFoundException("UserContactInfo with id " + userContactInfo.getId()
                    + " does not exist");
        }

        UserContactInfo updatedUserContactInfo = userContactInfoJpaRepo.save(userContactInfo);

        return userContactInfoMapper.mapToDTO(updatedUserContactInfo);
    }

    @Override
    public void deleteUserContactInfo(UserContactInfoDTO userContactInfoDTO) {

        UserContactInfo userContactInfo = userContactInfoMapper.mapToEntity(userContactInfoDTO);

        Optional<UserContactInfo> userContactInfoOptional = userContactInfoJpaRepo.findById(userContactInfo.getId());

        if (userContactInfoOptional.isEmpty()) {
            throw new EntityNotFoundException("UserContactInfo with id " + userContactInfo.getId()
                    + " does not exist");
        }

        userContactInfoJpaRepo.delete(userContactInfo);

    }

    @Override
    public Optional<UserContactInfoDTO> findUserContactInfoByUserId(Long userContactInfoId) {
        Optional<UserContactInfo> userContactInfoOptional = userContactInfoJpaRepo.findById(userContactInfoId);
        if (userContactInfoOptional.isEmpty()) {
            throw new EntityNotFoundException("UserContactInfo with id " + userContactInfoId
                    + " does not exist");
        }
        return Optional.of(userContactInfoMapper.mapToDTO(userContactInfoOptional.get()));
    }


}
