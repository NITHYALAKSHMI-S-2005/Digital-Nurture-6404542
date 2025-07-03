package com.example.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException {
        return countryRepository.findById(code).orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }

    @Override
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    @Transactional
    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    @Override
    public List<Country> searchCountriesByName(String name) {
        return countryRepository.findByCoNameContaining(name);
    }
}
