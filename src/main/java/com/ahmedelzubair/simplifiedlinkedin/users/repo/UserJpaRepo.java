package com.ahmedelzubair.simplifiedlinkedin.users.repo;

import com.ahmedelzubair.simplifiedlinkedin.users.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<AppUser, Long> {
    AppUser findByEmail(String email);
}
