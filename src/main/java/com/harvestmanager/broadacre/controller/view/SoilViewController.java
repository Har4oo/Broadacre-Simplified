package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.entity.Soil;
import com.harvestmanager.broadacre.service.LocationService;
import com.harvestmanager.broadacre.service.SoilService;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/soil")
@AllArgsConstructor
public class SoilViewController {
    private SoilService soilService;

    @GetMapping
    public String soilView(Model model){
        System.out.println(soilService.getSoils().toString());
        model.addAttribute("soils",soilService.getSoils());
        return "/soil/soil";
    }
    @GetMapping("/createSoil")
    public String createSoil(Model model){
        System.out.println("going to creating soil html");
        model.addAttribute("soil",new Soil());
        System.out.println(model.toString());
        return "/soil/createSoil";
    }
    @PostMapping("/post/createSoil")
    public String createSoil(@ModelAttribute Soil soil){
        System.out.println("created: "+soil);
        System.out.println("soil created");
        soilService.createSoil(soil);
        return "redirect:/soil";
    }
    @GetMapping("/editSoil/{id}")
    public String editSoil(Model model, @PathVariable long id){
        System.out.println("soil edit html");
        model.addAttribute("soil",soilService.getSoil(id));
        return "/soil/editSoil";
    }
    @PostMapping("/put/updateSoil/{id}")
    public String updateSoil(@PathVariable long id, @ModelAttribute Soil soil){
        System.out.println("updating value");
        soilService.updateSoil(soil,id);
        return "redirect:/soil";
    }
    @GetMapping("/deleteSoil/{id}")
    public String deleteSoil(@PathVariable long id){
        soilService.deleteSoil(id);
        return "redirect:/soil";
    }
}
