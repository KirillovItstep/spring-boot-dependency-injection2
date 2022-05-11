package com.example.springbootdependencyinjection2.countries.repository;

import com.example.springbootdependencyinjection2.countries.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
