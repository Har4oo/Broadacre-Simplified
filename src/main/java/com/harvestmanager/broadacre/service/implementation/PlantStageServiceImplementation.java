package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.repository.PlantStageRepository;
import com.harvestmanager.broadacre.service.PlantStageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlantStageServiceImplementation implements PlantStageService {
    private PlantStageRepository plantStageRepository;

    @Override
    public List<PlantStage> getPlantStages() {
        return plantStageRepository.findAll();
    }

    @Override
    public PlantStage getPlantStage(long id) {
        return plantStageRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public PlantStage createPlantStage(PlantStage plantStage) {
        System.out.println("Creating a plant stage");
        return plantStageRepository.save(plantStage);
    }

    @Override
    public PlantStage updatePlantStage(PlantStage plantStage, long id) {
        plantStage.setPlantStageId(id);
        return plantStageRepository.save(plantStage);
    }

    @Override
    public void deletePlantStage(long id) {
        plantStageRepository.deleteById(id);
    }

    @Override
    public int getPlantStageValue(PlantStage plantStage) {
        System.out.println("Getting plant stage value via the string");

        int plantStageInNumberValue = 0;
        switch (plantStage.getPlantStageName()){
            case "Sprout":
                plantStageInNumberValue = 1;
                break;
            case "Seedling":
                plantStageInNumberValue = 2;
                break;
            case "Vegetative":
                plantStageInNumberValue = 3;
                break;
            case "Budding":
                plantStageInNumberValue = 4;
                break;
            case "Flowering":
                plantStageInNumberValue = 5;
                break;
            case "Ripening":
                plantStageInNumberValue = 6;
                break;
        }
        return plantStageInNumberValue;
    }
}
