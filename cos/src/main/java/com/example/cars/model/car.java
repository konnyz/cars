package com.example.cars.model;


import javax.persistence.*;

@Entity
public class car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private String engine;
    private String price;
    @OneToOne
    private dealer dealer;
    @OneToOne
    private brand brand;



    public car() {
    }

    public car(String model, String engine, String price, com.example.cars.model.dealer dealer, com.example.cars.model.brand brand) {
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.dealer = dealer;
        this.brand = brand;
    }

    public car (String model) {this.model = model; }

    public com.example.cars.model.brand getBrand() {
        return brand;
    }

    public void setBrand(com.example.cars.model.brand brand) {
        this.brand = brand;
    }

    public void setDealer(com.example.cars.model.dealer dealer) {
        this.dealer = dealer;
    }

    public com.example.cars.model.dealer getDealer() {
        return dealer;
    }

    public Long getId() {
        return id;
    }


    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", price='" + price + '\'' +
                ", dealer=" + dealer +
                ", brand=" + brand +
                '}';
    }
}