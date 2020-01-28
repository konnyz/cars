package com.example.cars.repositories;

import com.example.cars.model.dealer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface dealerRespository extends CrudRepository<dealer, Long> {
   Optional<dealer> getFirstByFirstNameAndSurname(String firstName, String Surname);
}
