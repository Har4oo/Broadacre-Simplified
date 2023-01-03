package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.service.PlantStageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/plantStage")
public class PlantStageController {
    private PlantStageService plantStageService;

    public List<PlantStage> getPlantStages(){
        return plantStageService.getPlantStages();
    }
}
