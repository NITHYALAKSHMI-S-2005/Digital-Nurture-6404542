package com.example.country;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
    @Id
    private String coCode;
    private String coName;

    // Getters and setters
}
