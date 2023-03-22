package com.harvestmanager.broadacre.controller.api;

import com.harvestmanager.broadacre.entity.Crop;
import com.harvestmanager.broadacre.entity.CropType;
import com.harvestmanager.broadacre.service.CropTypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/cropType")
public class CropTypeController {
    private CropTypeService cropTypeService;

    @GetMapping("/cropType")
    public List<CropType> getCropTypes(){
        return cropTypeService.getCropTypes();
    }

    @GetMapping("/{id}")
    public CropType getCropType(@PathVariable("id") long id){
        return cropTypeService.getCropType(id);
    }

    @PostMapping("/createCropType")
    public CropType createCropType(@RequestBody CropType cropType){
        return cropTypeService.createCropType(cropType);
    }

    @PutMapping("/updateCropType/{id}")
    public CropType updateCropType(@RequestBody CropType cropType, @PathVariable("id") long id){
        return cropTypeService.updateCropType(cropType,id);
    }
    @DeleteMapping("/deleteCropType")
    public void deleteCropType(@PathVariable("id") long id){
        cropTypeService.deleteCropType(id);
    }
}
