package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.PlantStage;

import java.util.List;

public interface PlantStageService {
    List<PlantStage> getPlantStages();
    PlantStage getPlantStage(long id);
    PlantStage createPlantStage(PlantStage plantStage);
    PlantStage updatePlantStage(PlantStage plantStage, long id);
    void deletePlantStage(long id);
}
