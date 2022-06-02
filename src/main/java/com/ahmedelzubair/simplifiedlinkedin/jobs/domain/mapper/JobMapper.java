package com.ahmedelzubair.simplifiedlinkedin.jobs.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.Job;
import com.ahmedelzubair.simplifiedlinkedin.jobs.domain.dto.JobDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JobMapper {

    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);

    JobDTO mapToDTO(Job job);

    Job mapToEntity(JobDTO jobDTO);


}
