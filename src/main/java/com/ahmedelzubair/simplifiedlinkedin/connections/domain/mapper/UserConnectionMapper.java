package com.ahmedelzubair.simplifiedlinkedin.connections.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.connections.domain.UserConnection;
import com.ahmedelzubair.simplifiedlinkedin.connections.domain.dto.UserConnectionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConnectionMapper {

    UserConnectionMapper INSTANCE = Mappers.getMapper(UserConnectionMapper.class);

    UserConnectionDTO mapToDTO(UserConnection userConnection);

    UserConnection mapToEntity(UserConnectionDTO userConnectionDTO);

}
