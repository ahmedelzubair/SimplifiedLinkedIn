package com.ahmedelzubair.simplifiedlinkedin.addresses.controller;

import com.ahmedelzubair.simplifiedlinkedin.addresses.service.AddressService;
import org.springframework.web.bind.annotation.RestController;


@RestController("api/v1/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }


}
