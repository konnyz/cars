package com.example.cars.converters;


import com.example.cars.commands.DealerCommand;
import com.example.cars.model.dealer;
import com.example.cars.model.brand;
import com.example.cars.model.car;
import com.example.cars.model.carHistory;
import com.example.cars.repositories.dealerRespository;
import com.example.cars.repositories.brandRespository;
import com.example.cars.repositories.carsRepository;
import com.example.cars.repositories.carHistoryRespository;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by pk on 2019-06-03
 */
@Component
public class DealerCommandToDealer implements Converter<DealerCommand, dealer> {

    @Synchronized
    @Nullable
    @Override
    public dealer convert(DealerCommand source) {
        if (source == null) {
            return null;
        }

        final dealer dealer = new dealer();
        dealer.setFirstName(source.getFirstName());
        dealer.setSurname(source.getSurname());
        dealer.setCity(source.getCity());
        dealer.setStreet(source.getStreet());
        dealer.setHouseNumber(source.getHouseNumber());

        return dealer;
    }
}
