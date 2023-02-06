package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.Crop;
import com.harvestmanager.broadacre.entity.PlantStage;

import java.util.List;

public interface CropService {
    List<Crop> getCrops();
    Crop getCrop(long id);
    Crop createCrop(Crop crop);
    Crop updateCrop(Crop crop, long id);
    void deleteCrop(long id);
}
