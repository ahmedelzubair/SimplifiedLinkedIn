package com.ahmedelzubair.simplifiedlinkedin.addresses.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "cities")
public class City extends BaseEntity {


    private String name;
    private String code;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}