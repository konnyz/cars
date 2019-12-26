package com.example.cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class dealer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String FirstName;
    private String Surname;
    private String city;
    private String street;
    private String HouseNumber;

    public dealer() {
    }

    public dealer(String Surname, String Firstname) {this.Surname = Surname; this.FirstName = Firstname; };



    public dealer(String firstName, String surname, String city, String street, String houseNumber) {
        this.FirstName = firstName;
        this.Surname = surname;
        this.city = city;
        this.street = street;
        this.HouseNumber = houseNumber;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        HouseNumber = houseNumber;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return HouseNumber;
    }

    @Override
    public String toString() {
        return "dealer{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", HouseNumber='" + HouseNumber + '\'' +
                '}';
    }
}
