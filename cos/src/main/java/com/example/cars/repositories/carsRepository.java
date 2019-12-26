package com.example.cars.repositories;

import com.example.cars.model.car;
import org.springframework.data.repository.CrudRepository;

public interface carsRepository extends CrudRepository<car, Long> {

}