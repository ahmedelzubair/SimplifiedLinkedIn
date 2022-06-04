package com.ahmedelzubair.simplifiedlinkedin.users.service;

import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.dto.AppUserDTO;
import com.ahmedelzubair.simplifiedlinkedin.users.domain.mapper.UserMapper;
import com.ahmedelzubair.simplifiedlinkedin.users.repo.UserJpaRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserJpaRepo userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserJpaRepo userRepository) {
        this.userRepository = userRepository;
        this.userMapper = UserMapper.INSTANCE;
    }


    @Override
    public void createUser(AppUserDTO appUserDTO) {

        AppUser user = userMapper.mapToEntity(appUserDTO);
        userRepository.save(user);

    }

    @Override
    public void updateUser(AppUserDTO appUser) {

    }

    @Override
    public void deleteUser(AppUserDTO appUser) {

    }

    @Override
    public AppUserDTO findUserByEmail(String email) {
        return null;
    }

    @Override
    public AppUserDTO findUserById(Long id) {
        return null;
    }

    @Override
    public void changePassword(String email, String oldPassword, String newPassword) {

    }
}
