package com.example.springbootdependencyinjection2.jpa.repository;

import com.example.springbootdependencyinjection2.jpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

