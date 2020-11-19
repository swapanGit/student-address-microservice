package com.codeswapan.addressservice.service;

import com.codeswapan.addressservice.entity.Address;
import com.codeswapan.addressservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(Long addressId) {
        return addressRepository.findByAddressId(addressId);
    }
}
