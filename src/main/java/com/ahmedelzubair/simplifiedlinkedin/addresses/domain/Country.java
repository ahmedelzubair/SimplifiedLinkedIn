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
    private String currency;
    private String currencyCode;
    private String phoneCode;
    private String flagUrl;
    private String language;
    private String languageCode;
    private Long status;
    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continentId;

}