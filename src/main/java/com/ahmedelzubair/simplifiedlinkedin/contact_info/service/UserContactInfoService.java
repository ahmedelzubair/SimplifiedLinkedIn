package com.ahmedelzubair.simplifiedlinkedin.contact_info.service;

import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.dto.UserContactInfoDTO;

import java.util.Optional;

public interface UserContactInfoService {

    UserContactInfoDTO createUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    UserContactInfoDTO updateUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    void deleteUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    Optional<UserContactInfoDTO> findUserContactInfoByUserId(Long userId);

}
