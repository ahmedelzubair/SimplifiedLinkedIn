package com.ahmedelzubair.simplifiedlinkedin.address.repo;

import com.ahmedelzubair.simplifiedlinkedin.address.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepo extends JpaRepository<Address, Long> {


}
