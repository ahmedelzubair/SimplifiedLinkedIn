package com.ahmedelzubair.simplifiedlinkedin.addresses.domain.dto;

import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.City;
import com.ahmedelzubair.simplifiedlinkedin.addresses.domain.Country;
import lombok.Data;

@Data

public class AddressDTO {

    private String street;
    private City city;
    private String zipCode;
    private Country country;

}
