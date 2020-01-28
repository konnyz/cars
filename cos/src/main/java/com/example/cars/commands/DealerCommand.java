package com.example.cars.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class DealerCommand {

    private Long id;
    private String FirstName;
    private String Surname;
    private String city;
    private String street;
    private String HouseNumber;
}
