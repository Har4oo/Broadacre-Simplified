package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.service.PlantStageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/plantStage")
public class PlantStageController {
    private PlantStageService plantStageService;

    @GetMapping("/plantStageList")
    public List<PlantStage> getPlantStages() {
        return plantStageService.getPlantStages();
    }

    @GetMapping("/{id}")
    public PlantStage getPlantStage(@PathVariable("id") long id) {
        return plantStageService.getPlantStage(id);
    }

    @PostMapping("/createPlantStage")
    public PlantStage createPlantStage(@RequestBody PlantStage plantStage) {
        return plantStageService.createPlantStage(plantStage);
    }

    @PutMapping("/updateCrop/{id}")
    public PlantStage plantStage(@RequestBody PlantStage plantStage, @PathVariable("id") long id) {
        return plantStageService.updatePlantStage(plantStage, id);
    }

    @DeleteMapping("/deleteCrop/{id}")
    public void deleteCrop(@PathVariable("id") long id){
        plantStageService.deletePlantStage(id);
    }
}
