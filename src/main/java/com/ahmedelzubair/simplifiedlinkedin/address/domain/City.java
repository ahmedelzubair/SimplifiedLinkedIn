package com.ahmedelzubair.simplifiedlinkedin.address.domain;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;
    private String code;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}