package com.ahmedelzubair.simplifiedlinkedin.connections.service;

import com.ahmedelzubair.simplifiedlinkedin.connections.domain.UserConnection;
import com.ahmedelzubair.simplifiedlinkedin.connections.domain.dto.UserConnectionDTO;
import com.ahmedelzubair.simplifiedlinkedin.connections.domain.mapper.UserConnectionMapper;
import com.ahmedelzubair.simplifiedlinkedin.connections.repo.UserConnectionJpaRepo;
import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserConnectionsServiceImpl implements UserConnectionsService {

    private final UserConnectionJpaRepo userConnectionJpaRepo;
    private final UserConnectionMapper userConnectionMapper;

    public UserConnectionsServiceImpl(UserConnectionJpaRepo userConnectionJpaRepo) {
        this.userConnectionJpaRepo = userConnectionJpaRepo;
        this.userConnectionMapper = UserConnectionMapper.INSTANCE;
    }


    @Override
    public UserConnectionDTO createUserConnection(UserConnectionDTO userConnectionDTO) {

        UserConnection userConnection = userConnectionMapper.mapToEntity(userConnectionDTO);

        userConnectionJpaRepo.save(userConnection);
        return userConnectionMapper.mapToDTO(userConnection);
    }

    @Override
    public UserConnectionDTO updateUserConnection(UserConnectionDTO userConnectionDTO) {

        UserConnection userConnection = userConnectionMapper.mapToEntity(userConnectionDTO);

        Optional<UserConnection> userConnectionOptional = userConnectionJpaRepo.findById(userConnection.getId());

        if (userConnectionOptional.isEmpty()) {
            throw new EntityNotFoundException("UserConnection with id " + userConnection.getId()
                    + " does not exist");
        }

        UserConnection updatedUserConnection = userConnectionJpaRepo.save(userConnection);

        return userConnectionMapper.mapToDTO(updatedUserConnection);
    }

    @Override
    public void deleteUserConnection(UserConnectionDTO userConnectionDTO) {

        UserConnection userConnection = userConnectionMapper.mapToEntity(userConnectionDTO);

        Optional<UserConnection> userConnectionOptional = userConnectionJpaRepo.findById(userConnection.getId());

        if (userConnectionOptional.isEmpty()) {
            throw new EntityNotFoundException("UserConnection with id " + userConnection.getId()
                    + " does not exist");
        }

        userConnectionJpaRepo.delete(userConnection);
    }

    @Override
    public Optional<UserConnectionDTO> findUserConnectionById(Long userConnectionId) {
        Optional<UserConnection> userConnectionOptional = userConnectionJpaRepo.findById(userConnectionId);
        if (userConnectionOptional.isEmpty()) {
            throw new EntityNotFoundException("UserConnection with id " + userConnectionId
                    + " does not exist");
        }
        return Optional.of(userConnectionMapper.mapToDTO(userConnectionOptional.get()));
    }

//    @Override
//    public Optional<UserConnectionDTO> findUserConnectionByName(String userConnectionName) {
//        Optional<UserConnection> userConnectionOptional = userConnectionJpaRepo.findByName(userConnectionName);
//        if (userConnectionOptional.isEmpty()) {
//            throw new EntityNotFoundException("UserConnection with name " + userConnectionName
//                    + " does not exist");
//        }
//        return Optional.of(userConnectionMapper.mapToDTO(userConnectionOptional.get()));
//    }
}
