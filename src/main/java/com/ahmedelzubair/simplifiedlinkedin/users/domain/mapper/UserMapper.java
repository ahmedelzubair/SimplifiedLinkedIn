package com.ahmedelzubair.simplifiedlinkedin.users.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.dto.AppUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    AppUserDTO mapToDTO(AppUser user);

    AppUser mapToEntity(AppUserDTO appUserDTO);

}
