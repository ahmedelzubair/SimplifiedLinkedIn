package com.ahmedelzubair.simplifiedlinkedin.jobs.service;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.dto.JobDTO;

public interface JobService {

    void createJob(JobDTO jobDTO);

    void updateJob(JobDTO jobDTO);

    void deleteJob(JobDTO jobDTO);

    JobDTO getJob(String jobId);


}
