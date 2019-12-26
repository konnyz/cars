package com.example.cars.repositories;

import com.example.cars.model.dealer;
import org.springframework.data.repository.CrudRepository;


public interface dealerRespository extends CrudRepository<dealer, Long> {
}
