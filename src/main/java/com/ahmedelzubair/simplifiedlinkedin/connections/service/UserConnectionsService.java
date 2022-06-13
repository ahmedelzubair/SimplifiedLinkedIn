package com.ahmedelzubair.simplifiedlinkedin.connections.service;

import com.ahmedelzubair.simplifiedlinkedin.connections.domain.dto.UserConnectionDTO;

import java.util.Optional;

public interface UserConnectionsService {

    UserConnectionDTO createUserConnection(UserConnectionDTO userConnectionDTO);

    UserConnectionDTO updateUserConnection(UserConnectionDTO userConnectionDTO);

    void deleteUserConnection(UserConnectionDTO userConnectionDTO);

    Optional<UserConnectionDTO> findUserConnectionById(Long userConnectionId);


}
