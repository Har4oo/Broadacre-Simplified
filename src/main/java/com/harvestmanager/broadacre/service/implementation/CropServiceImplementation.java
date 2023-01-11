package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.Crop;
import com.harvestmanager.broadacre.repository.CropRepository;
import com.harvestmanager.broadacre.service.CropService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CropServiceImplementation implements CropService {

    private CropRepository cropRepository;
    @Override
    public List<Crop> getCrops() {
        System.out.println("Listing all crops");
        return cropRepository.findAll();
    }

    @Override
    public Crop getCrop(long id) {
        System.out.println("Listing crop by ID given");
        return cropRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public Crop createCrop(Crop crop) {
        System.out.println("Saving "+crop.getCropName()+" crop");
        return cropRepository.save(crop);
    }

    @Override
    public Crop updateCrop(Crop crop, long id) {
        System.out.println("Updating "+crop.getCropName()+" crop");
        crop.setCropId(id);
        return cropRepository.save(crop);
    }

    @Override
    public void deleteCrop(long id) {
        System.out.println("Deleting crop");
        cropRepository.deleteById(id);
        System.out.println("Crop deleted successfully");
    }
}
