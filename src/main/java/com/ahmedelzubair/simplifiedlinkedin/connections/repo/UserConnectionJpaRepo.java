package com.ahmedelzubair.simplifiedlinkedin.connections.repo;

import com.ahmedelzubair.simplifiedlinkedin.connections.domain.UserConnection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConnectionJpaRepo extends JpaRepository<UserConnection, Long> {


}
