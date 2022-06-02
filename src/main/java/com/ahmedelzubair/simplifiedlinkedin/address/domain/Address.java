package com.ahmedelzubair.simplifiedlinkedin.address.domain;

import com.ahmedelzubair.simplifiedlinkedin.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "address")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends BaseEntity {

    private String street;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


}
