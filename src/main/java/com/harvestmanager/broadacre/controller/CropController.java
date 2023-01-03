package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.Crop;
import com.harvestmanager.broadacre.service.CropService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/crop")
public class CropController {
    private CropService cropService;

    @GetMapping("/cropList")
    public List<Crop> getCrops() {
        return cropService.getCrops();
    }

    @GetMapping("/crop/{id}")
    public Crop getCrop(@PathVariable("id") long id) {
        return cropService.getCrop(id);
    }

    @PostMapping("/createCrop")
    public Crop createCrop(@RequestBody Crop crop) {
        return cropService.createCrop(crop);
    }

    @PutMapping("/updateCrop/{id}")
    public Crop updateCrop(@RequestBody Crop crop, @PathVariable("id") long id) {
        return cropService.updateCrop(crop, id);
    }

    @DeleteMapping("/deleteCrop/{id}")
    public void deleteCrop(@PathVariable("id") long id) {
        cropService.deleteCrop(id);
    }
}

