package com.codeswapan.addressservice.repository;

import com.codeswapan.addressservice.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    Address findByAddressId(Long addressId);
}
