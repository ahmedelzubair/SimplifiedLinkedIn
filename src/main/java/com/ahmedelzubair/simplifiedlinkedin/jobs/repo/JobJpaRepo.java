package com.ahmedelzubair.simplifiedlinkedin.jobs.repo;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface JobJpaRepo extends JpaRepository<Job, Long> {
    Optional<Set<Job>> findJobsByTitle(String jobName);

    Optional<Set<Job>> findJobsByCompanyId(Long companyId);

}
