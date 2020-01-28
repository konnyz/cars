package com.example.cars.controllers;

import com.example.cars.commands.DealerCommand;
import com.example.cars.converters.DealerCommandToDealer;
import com.example.cars.model.dealer;
import com.example.cars.repositories.dealerRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class dealersController {

    private dealerRespository dealerRespository;

    public  dealersController(dealerRespository dealerRespository){
        this.dealerRespository = dealerRespository;
    }
    @RequestMapping(value = {"/dealers", "/dealer/dealers"})
    public String getDealers(Model model){
        model.addAttribute("dealers", dealerRespository.findAll());

        return "dealer/dealers";
    }

    @GetMapping
    @RequestMapping("/dealer/adddealer")
    public String newSong(Model model){
        model.addAttribute("dealer", new DealerCommand());
        return "dealer/adddealer";
    }

  @PostMapping("dealer")
    public String saveOrUpdate(@ModelAttribute DealerCommand command){

        Optional<dealer> dealerOptional = dealerRespository.getFirstByFirstNameAndSurname(command.getFirstName(), command.getSurname());

        if (!dealerOptional.isPresent()) {
            DealerCommandToDealer converter = new DealerCommandToDealer();
            dealer detachedArtist = converter.convert(command);
            dealer savedArtist = dealerRespository.save(detachedArtist);
            return "redirect:/dealer/dealers";
        } else {
            //TODO: error message to template
            System.out.println("Sorry, there's such artist in db");
            return "redirect:/dealer/dealers";
        }
    }


}
