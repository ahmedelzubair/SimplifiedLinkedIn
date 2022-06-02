package com.ahmedelzubair.simplifiedlinkedin.contact_info.repo;

import com.ahmedelzubair.simplifiedlinkedin.contact_info.domain.UserContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactInfoJpaRepo extends JpaRepository<UserContactInfo, Long> {


}
