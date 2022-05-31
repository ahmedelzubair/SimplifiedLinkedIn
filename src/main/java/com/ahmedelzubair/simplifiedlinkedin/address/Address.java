package com.ahmedelzubair.simplifiedlinkedin.address;

import com.ahmedelzubair.simplifiedlinkedin.user.AppUser;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "addressId")
    private AppUser user;
    private String street;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


}
