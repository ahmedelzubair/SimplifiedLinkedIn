package com.ahmedelzubair.simplifiedlinkedin.jobs.service;

import com.ahmedelzubair.simplifiedlinkedin.exception.EntityNotFoundException;
import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.Job;
import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.dto.JobDTO;
import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.mapper.JobMapper;
import com.ahmedelzubair.simplifiedlinkedin.jobs.repo.JobJpaRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {

    private final JobJpaRepo jobJpaRepo;
    private final JobMapper jobMapper;

    public JobServiceImpl(JobJpaRepo jobJpaRepo) {
        this.jobJpaRepo = jobJpaRepo;
        this.jobMapper = JobMapper.INSTANCE;
    }

    @Override
    public JobDTO createJob(JobDTO jobDTO) {

        Job job = jobMapper.mapToEntity(jobDTO);
        jobJpaRepo.save(job);
        return jobMapper.mapToDTO(job);
    }

    @Override
    public JobDTO updateJob(JobDTO jobDTO) {

        Job job = jobMapper.mapToEntity(jobDTO);
        Optional<Job> jobOptional = jobJpaRepo.findById(job.getId());

        if (jobOptional.isEmpty()) {
            throw new EntityNotFoundException("Job with id " + job.getId()
                    + " does not exist");
        }

        Job updatedJob = jobJpaRepo.save(job);
        return jobMapper.mapToDTO(updatedJob);
    }

    @Override
    public void deleteJob(JobDTO jobDTO) {

        Job job = jobMapper.mapToEntity(jobDTO);
        Optional<Job> jobOptional = jobJpaRepo.findById(job.getId());

        if (jobOptional.isEmpty()) {
            throw new EntityNotFoundException("Job with id " + job.getId()
                    + " does not exist");
        }

        jobJpaRepo.delete(job);

    }

    @Override
    public Optional<JobDTO> findJobById(Long jobId) {

        Optional<Job> jobOptional = jobJpaRepo.findById(jobId);
        if (jobOptional.isEmpty()) {
            throw new EntityNotFoundException("Job with id " + jobId
                    + " does not exist");
        }
        return Optional.of(jobMapper.mapToDTO(jobOptional.get()));
    }

    @Override
    public Set<JobDTO> findJobsByTitle(String jobName) {

        Optional<Set<Job>> jobOptional = jobJpaRepo.findJobsByTitle(jobName);

        if (jobOptional.isEmpty()) {
            throw new EntityNotFoundException("Job with title " + jobName
                    + " does not exist");
        }

        return jobOptional.get().stream().map(jobMapper::mapToDTO)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<JobDTO> findJobsByCompanyId(Long companyId) {

        Optional<Set<Job>> jobOptional = jobJpaRepo.findJobsByCompanyId(companyId);

        if (jobOptional.isEmpty()) {
            throw new EntityNotFoundException("Job with company id " + companyId
                    + " does not exist");
        }

        return jobOptional.get().stream().map(jobMapper::mapToDTO)
                .collect(Collectors.toSet());
    }
}
