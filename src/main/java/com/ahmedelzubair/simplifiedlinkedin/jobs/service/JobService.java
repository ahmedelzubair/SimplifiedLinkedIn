package com.ahmedelzubair.simplifiedlinkedin.jobs.service;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.dto.JobDTO;

import java.util.Optional;
import java.util.Set;

//
public interface JobService {

    void createJob(JobDTO jobDTO);

    JobDTO updateJob(JobDTO jobDTO);

    void deleteJob(JobDTO jobDTO);

    Optional<JobDTO> findJobById(Long jobId);

    Optional<JobDTO> findJobByName(String jobName);

    Set<JobDTO> findJobsByCompanyName(String companyName);


}
