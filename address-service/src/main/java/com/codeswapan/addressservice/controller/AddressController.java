package com.codeswapan.addressservice.controller;

import com.codeswapan.addressservice.entity.Address;
import com.codeswapan.addressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/getAddressById/{id}")
    public Address getAddressById(@PathVariable("id") Long addressId){
        return addressService.getAddressById(addressId);
    }
}
