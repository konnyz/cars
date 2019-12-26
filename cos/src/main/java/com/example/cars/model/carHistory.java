package com.example.cars.model;

import javax.persistence.*;

@Entity
public class carHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String YProduction;
    private String mileage;
    @OneToOne
    private car car;

    @OneToOne
    private brand brand;



    @OneToOne
    private dealer dealer;

    public carHistory() {
    }

    public carHistory( String YProduction, String mileage, com.example.cars.model.car car, com.example.cars.model.brand brand, com.example.cars.model.dealer dealer) {
        this.YProduction = YProduction;
        this.mileage = mileage;
        this.car = car;
        this.brand = brand;
        this.dealer = dealer;
    }

    public void setBrand(com.example.cars.model.brand brand) {
        this.brand = brand;
    }

    public com.example.cars.model.brand getBrand() {
        return brand;
    }

    public void setDealer(com.example.cars.model.dealer dealer) {
        this.dealer = dealer;
    }

    public com.example.cars.model.dealer getDealer() {
        return dealer;
    }

    public void setId(Long id) {
        this.id = id;
    }





    public void setYProduction(String YProduction) {
        this.YProduction = YProduction;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Long getId() {
        return id;
    }






    public String getYProduction() {
        return YProduction;
    }

    public String getMileage() {
        return mileage;
    }

    public com.example.cars.model.car getCar() {
        return car;
    }

    public void setCar(com.example.cars.model.car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "carHistory{" +
                "id=" + id +
                ", YProduction='" + YProduction + '\'' +
                ", mileage='" + mileage + '\'' +
                ", car=" + car +
                ", brand=" + brand +
                ", dealer=" + dealer +
                '}';
    }
}
