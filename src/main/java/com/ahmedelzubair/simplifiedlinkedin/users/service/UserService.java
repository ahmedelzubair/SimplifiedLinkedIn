package com.ahmedelzubair.simplifiedlinkedin.users.service;

import com.ahmedelzubair.simplifiedlinkedin.users.domain.dto.AppUserDTO;

public interface UserService {

    AppUserDTO createUser(AppUserDTO appUserDTO);

    AppUserDTO updateUser(AppUserDTO appUser);

    void deleteUser(AppUserDTO appUser);

    AppUserDTO findUserByEmail(String email);

    AppUserDTO findUserById(Long id);

    void changePassword(String email, String oldPassword, String newPassword);


}
