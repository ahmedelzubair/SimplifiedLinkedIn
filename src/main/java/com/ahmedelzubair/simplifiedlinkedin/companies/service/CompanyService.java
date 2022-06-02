package com.ahmedelzubair.simplifiedlinkedin.companies.service;

import com.ahmedelzubair.simplifiedlinkedin.companies.domain.dto.CompanyDTO;

public interface CompanyService {

    void createJob(CompanyDTO jobDTO);

    void updateJob(CompanyDTO jobDTO);

    void deleteJob(CompanyDTO jobDTO);

    CompanyDTO getJob(String jobId);


}
