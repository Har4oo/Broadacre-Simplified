package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.Soil;
import com.harvestmanager.broadacre.service.SoilService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/soil")
public class SoilController {
    private SoilService soilService;

    @GetMapping("/soilList")
    public List<Soil> getSoils(){
        return soilService.getSoils();
    }

    @GetMapping("/{id}")
    public Soil getSoil(@PathVariable("id") long id){
        return soilService.getSoil(id);
    }

    @PostMapping("/createSoil")
    public Soil createSoil(@RequestBody Soil soil){
        return soilService.createSoil(soil);
    }

    @PutMapping("/updateSoil/{id}")
    public Soil updateSoil(@RequestBody Soil soil, @PathVariable("id")long id){
        return soilService.updateSoil(soil,id);
    }

    @DeleteMapping("/deleteSoil/{id}")
    public void deleteSoil(@PathVariable("id") long id){
        soilService.deleteSoil(id);
    }
}
