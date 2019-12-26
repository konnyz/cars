package com.example.cars.controllers;

import com.example.cars.repositories.dealerRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dealersController {

    private dealerRespository dealerRespository;

    public  dealersController(dealerRespository dealerRespository){
        this.dealerRespository = dealerRespository;
    }
    @RequestMapping("/dealers")
    public String getDealers(Model model){
        model.addAttribute("dealers", dealerRespository.findAll());

        return "dealers";
    }
}
