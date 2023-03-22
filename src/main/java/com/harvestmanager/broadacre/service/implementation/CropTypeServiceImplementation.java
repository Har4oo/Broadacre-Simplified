package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.CropType;
import com.harvestmanager.broadacre.repository.CropTypeRepository;
import com.harvestmanager.broadacre.service.CropTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CropTypeServiceImplementation implements CropTypeService {
    private CropTypeRepository cropTypeRepository;

    @Override
    public List<CropType> getCropTypes() {
        System.out.println("Listing current cropTypes");
        return cropTypeRepository.findAll();
    }

    @Override
    public CropType getCropType(long id) {
        System.out.println("Listing location by ID given");
        return cropTypeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public CropType createCropType(CropType cropType) {
        System.out.println("Creating a new cropType");
        return cropTypeRepository.save(cropType);
    }

    @Override
    public CropType updateCropType(CropType cropType, long id) {
        System.out.println("Updating cropType");
        cropType.setCropTypeId(id);
        return cropTypeRepository.save(cropType);
    }

    @Override
    public void deleteCropType(long id) {
        System.out.println("Deleting cropType");
        cropTypeRepository.deleteById(id);
    }
}
