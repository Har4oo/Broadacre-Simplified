package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.entity.Soil;
import com.harvestmanager.broadacre.service.LocationService;
import com.harvestmanager.broadacre.service.PlantStageService;
import com.harvestmanager.broadacre.service.SoilService;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/plantStage")
@AllArgsConstructor
public class PlantStageViewController {
    private PlantStageService plantStageService;

    @GetMapping
    public String plantStageView(Model model){
        System.out.println("all the plant stages: "+plantStageService.getPlantStages().toString());
        model.addAttribute("plantStages",plantStageService.getPlantStages());
        return "/plantstage/plantStage";
    }
    @GetMapping("/createPlantStage")
    public String createPlantStage(Model model){
        System.out.println("going to creating plantStage html");
        model.addAttribute("plantStage",new PlantStage());
        System.out.println(model.toString());
        return "/plantstage/createPlantStage";
    }
    @PostMapping("/post/createPlantStage")
    public String createPlantStage(@ModelAttribute PlantStage plantStage){
        System.out.println("created: "+plantStage);
        System.out.println("soil created");
        plantStageService.createPlantStage(plantStage);
        return "redirect:/plantStage";
    }
    @GetMapping("/editPlantStage/{id}")
    public String editPlantStage(Model model, @PathVariable long id){
        System.out.println("plantStage edit html");
        model.addAttribute("plantStage",plantStageService.getPlantStage(id));
        return "/plantstage/editPlantStage";
    }
    @PostMapping("/put/updatePlantStage/{id}")
    public String updatePlantStage(@PathVariable long id, @ModelAttribute PlantStage plantStage){
        System.out.println("updating value");
        plantStageService.updatePlantStage(plantStage,id);
        return "redirect:/plantStage";
    }
    @GetMapping("/deletePlantStage/{id}")
    public String deletePlantStage(@PathVariable long id){
        plantStageService.deletePlantStage(id);
        return "redirect:/plantStage";
    }
}
