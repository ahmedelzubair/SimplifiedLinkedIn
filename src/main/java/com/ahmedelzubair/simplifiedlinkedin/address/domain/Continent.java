package com.ahmedelzubair.simplifiedlinkedin.address.domain;

import javax.persistence.*;

@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;

}