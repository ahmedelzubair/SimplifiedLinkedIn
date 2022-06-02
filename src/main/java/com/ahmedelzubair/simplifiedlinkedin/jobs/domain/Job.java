package com.ahmedelzubair.simplifiedlinkedin.jobs.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "jobs")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {


    private String title;
    private String description;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    @Enumerated(EnumType.STRING)
    private JobNature jobNature;
    @Enumerated(EnumType.STRING)
    private JobStatus status;
    private String payRange;
    private String skills; // can be enhanced to a list of skills.

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Company company;

    private LocalDate createdAt;
    private LocalDate updatedAt;

}
