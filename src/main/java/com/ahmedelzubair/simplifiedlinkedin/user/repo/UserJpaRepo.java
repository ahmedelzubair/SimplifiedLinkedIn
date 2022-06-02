package com.ahmedelzubair.simplifiedlinkedin.user.repo;

import com.ahmedelzubair.simplifiedlinkedin.user.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<AppUser, Long> {
}
