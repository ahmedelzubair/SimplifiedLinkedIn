package com.ahmedelzubair.simplifiedlinkedin.address.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;

import javax.persistence.Entity;

@Entity(name = "continents")
public class Continent extends BaseEntity {

    private String name;

}