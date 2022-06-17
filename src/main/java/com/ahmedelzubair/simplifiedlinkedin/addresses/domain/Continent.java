package com.ahmedelzubair.simplifiedlinkedin.addresses.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "continents")
@Getter
@Setter
public class Continent extends BaseEntity {

    private String name;
    @Column(name = "code", unique = true, nullable = false)
    private String code;

}