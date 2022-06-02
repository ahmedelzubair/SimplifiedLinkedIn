package com.ahmedelzubair.simplifiedlinkedin.jobs.repo;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobJpaRepo extends JpaRepository<Job, Long> {
}
