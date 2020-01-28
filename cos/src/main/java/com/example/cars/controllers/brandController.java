package com.example.cars.controllers;

import com.example.cars.repositories.brandRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class brandController {

    private brandRespository brandRespository;

    public brandController(brandRespository brandRespository){ this.brandRespository = brandRespository;}

    @RequestMapping("/brands")
    public String getBrands(Model model){
        model.addAttribute("brands", brandRespository.findAll());

        return "brands";
    }

}
