package com.example.cars.repositories;

import com.example.cars.model.carHistory;
import org.springframework.data.repository.CrudRepository;

public interface carHistoryRespository extends CrudRepository<carHistory, Long> {
}
