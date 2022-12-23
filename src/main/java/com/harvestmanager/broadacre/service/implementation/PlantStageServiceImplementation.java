package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.repository.PlantStageRepository;
import com.harvestmanager.broadacre.service.PlantStageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PlantStageServiceImplementation implements PlantStageService {
    private PlantStageRepository plantStageRepository;

    @Override
    public List<PlantStage> getPlantStages() {
        return null;
    }

    @Override
    public PlantStage getPlantStage(long id) {
        return plantStageRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public PlantStage createPlantStage(PlantStage plantStage) {
        return null;
    }

    @Override
    public PlantStage updatePlantStage(PlantStage plantStage, long id) {
        return null;
    }

    @Override
    public void deletePlantStage(long id) {

    }
}
