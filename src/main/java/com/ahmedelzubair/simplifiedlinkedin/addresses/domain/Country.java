package com.ahmedelzubair.simplifiedlinkedin.addresses.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@AllArgsConstructor
@Entity(name = "countries")
@NoArgsConstructor
@Getter
@Setter
public class Country extends BaseEntity {

    private String name;
    private String code;
    private String iso3Code;
    private String phoneCode;
    @ManyToOne
    @JoinColumn(name = "continent_code", referencedColumnName = "code")
    private Continent continent;
    private String flagUrl;
}