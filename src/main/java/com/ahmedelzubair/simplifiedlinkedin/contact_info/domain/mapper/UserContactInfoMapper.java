package com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.UserContactInfo;
import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.dto.UserContactInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserContactInfoMapper {

    UserContactInfoMapper INSTANCE = Mappers.getMapper(UserContactInfoMapper.class);

    UserContactInfoDTO mapToDTO(UserContactInfo userContactInfo);

    UserContactInfo mapToEntity(UserContactInfoDTO userContactInfoDTO);


}
