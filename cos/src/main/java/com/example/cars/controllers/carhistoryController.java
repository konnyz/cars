package com.example.cars.controllers;

import com.example.cars.repositories.carHistoryRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class carhistoryController {

    private carHistoryRespository carHistoryRespository;

    public carhistoryController(carHistoryRespository carHistoryRespository) {this.carHistoryRespository = carHistoryRespository;}
    @RequestMapping("/carsHistory")
    public String getCarsHistory (Model model){

        model.addAttribute("carsHistory", carHistoryRespository.findAll());

        return "carsHistory";
    }
}
