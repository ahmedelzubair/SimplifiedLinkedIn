package com.ahmedelzubair.simplifiedlinkedin.contact_info.service;

import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.dto.UserContactInfoDTO;

public interface UserContactInfoService {

    void createUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    void updateUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    void deleteUserContactInfo(UserContactInfoDTO userContactInfoDTO);

    UserContactInfoDTO getUserContactInfo(String userContactInfoId);

}
