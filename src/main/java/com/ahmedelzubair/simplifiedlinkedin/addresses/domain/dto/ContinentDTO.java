package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ContinentDTO {
    private Long id;
    private String name;
}

