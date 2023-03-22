package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.CropType;

import java.util.List;

public interface CropTypeService {
    List<CropType> getCropTypes();

    CropType getCropType(long id);

    CropType createCropType(CropType cropType);

    CropType updateCropType(CropType cropType, long id);

    void deleteCropType(long id);
}
