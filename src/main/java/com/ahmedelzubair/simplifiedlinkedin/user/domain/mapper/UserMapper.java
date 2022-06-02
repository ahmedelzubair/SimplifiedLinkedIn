package com.ahmedelzubair.simplifiedlinkedin.user.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import com.ahmedelzubair.simplifiedlinkedin.user.domain.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO mapToDTO(AppUser user);

    AppUser mapToEntity(UserDTO userDTO);

}
