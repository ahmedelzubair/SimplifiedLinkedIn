package com.ahmedelzubair.simplifiedlinkedin.addresses.repo;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepo extends JpaRepository<Address, Long> {


}
