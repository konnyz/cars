package com.example.cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CreationDate;
    private String BrandOwner;
    private String Country;
    private String name;

    public brand() {
    }

    public brand(String creationDate, String brandOwner, String country, String name) {
        this.CreationDate = creationDate;
        this. BrandOwner = brandOwner;
        this.Country = country;
        this.name = name;
    }

    public brand(String name){this.name = name;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public void setBrandOwner(String brandOwner) {
        BrandOwner = brandOwner;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public String getBrandOwner() {
        return BrandOwner;
    }

    public String getCountry() {
        return Country;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "brand{" +
                "id=" + id +
                ", CreationDate='" + CreationDate + '\'' +
                ", BrandOwner='" + BrandOwner + '\'' +
                ", Country='" + Country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
