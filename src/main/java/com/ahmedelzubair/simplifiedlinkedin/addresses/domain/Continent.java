package com.ahmedelzubair.simplifiedlinkedin.addresses.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import lombok.Getter;

import javax.persistence.Entity;

@Entity(name = "continents")
@Getter
public class Continent extends BaseEntity {

    private String name;

}