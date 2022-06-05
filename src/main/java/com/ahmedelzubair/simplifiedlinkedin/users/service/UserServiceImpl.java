package com.ahmedelzubair.simplifiedlinkedin.users.service;

import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotSavedException;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.dto.AppUserDTO;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.mapper.UserMapper;
import com.ahmedelzubair.simplifiedlinkedin.users.repo.UserJpaRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserJpaRepo userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserJpaRepo userRepository) {
        this.userRepository = userRepository;
        this.userMapper = UserMapper.INSTANCE;
    }


    @Override
    public AppUserDTO createUser(AppUserDTO appUserDTO) {

        AppUser user = userMapper.mapToEntity(appUserDTO);
        userRepository.save(user);

        AppUserDTO savedUser = userMapper.mapToDTO(user);
        if (savedUser == null) {
            throw new EntityNotSavedException("User not saved");
        }
        return savedUser;
    }

    @Override
    public AppUserDTO updateUser(AppUserDTO appUser) {

        AppUser user = userMapper.mapToEntity(appUser);

        Optional<AppUser> userOptional = userRepository.findById(user.getId());

        if (userOptional.isEmpty()) {
            throw new EntityNotSavedException("Requested user not found");
        }

        AppUser updatedUser = userRepository.save(user);

        return userMapper.mapToDTO(updatedUser);
    }

    @Override
    public void deleteUser(AppUserDTO appUser) {

        AppUser user = userMapper.mapToEntity(appUser);

        Optional<AppUser> userOptional = userRepository.findById(user.getId());

        if (userOptional.isEmpty()) {
            throw new EntityNotSavedException("Requested user not found");
        }

        userRepository.delete(user);
    }

    @Override
    public AppUserDTO findUserByEmail(String email) {
        AppUser user = userRepository.findByEmail(email);
        if (user == null) {
            throw new EntityNotSavedException("User not found");
        }
        return userMapper.mapToDTO(user);
    }

    @Override
    public AppUserDTO findUserById(Long id) {
        Optional<AppUser> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new EntityNotSavedException("User not found");
        }
        return userMapper.mapToDTO(userOptional.get());
    }

    @Override
    public void changePassword(String email, String oldPassword, String newPassword) {

    }
}
