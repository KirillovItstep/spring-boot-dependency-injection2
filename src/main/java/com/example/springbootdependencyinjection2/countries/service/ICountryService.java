package com.example.springbootdependencyinjection2.countries.service;

import com.example.springbootdependencyinjection2.countries.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICountryService {
    List<Country> findAll();
    public Country findOne(Long id);
    public void saveAll(List<Country> countries);
}