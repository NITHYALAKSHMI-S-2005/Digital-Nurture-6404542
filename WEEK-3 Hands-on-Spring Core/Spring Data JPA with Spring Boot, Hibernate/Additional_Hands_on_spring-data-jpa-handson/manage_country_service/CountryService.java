package com.example.country;

import java.util.List;

public interface CountryService {
    Country findCountryByCode(String code) throws CountryNotFoundException;
    void addCountry(Country country);
    void updateCountry(Country country);
    void deleteCountry(String code);
    List<Country> searchCountriesByName(String name);
}
