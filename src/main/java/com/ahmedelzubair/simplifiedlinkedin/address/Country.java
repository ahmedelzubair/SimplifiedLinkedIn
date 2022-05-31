package com.ahmedelzubair.simplifiedlinkedin.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@Entity
@Table(name = "countries")
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
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