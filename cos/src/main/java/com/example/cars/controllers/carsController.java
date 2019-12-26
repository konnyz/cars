package com.example.cars.controllers;

import com.example.cars.repositories.carsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class carsController {

    private carsRepository carsRepository;

    public carsController(carsRepository carsRepository){ this.carsRepository = carsRepository;}

    @RequestMapping("/cars")
    public String getCars(Model model) {

        model.addAttribute("cars", carsRepository.findAll());

        return "cars";
    }
}
