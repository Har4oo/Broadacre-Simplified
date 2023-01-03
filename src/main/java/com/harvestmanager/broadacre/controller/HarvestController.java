package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.Harvest;
import com.harvestmanager.broadacre.service.HarvestService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/harvest")
public class HarvestController {
    private HarvestService harvestService;

    @GetMapping("/harvestList")
    public List<Harvest> getHarvests() {
        return harvestService.getHarvests();
    }

    @GetMapping("/harvest/{id}")
    public Harvest getHarvest(@PathVariable("id") long id) {
        return harvestService.getHarvest(id);
    }

    @PostMapping("/createHarvest")
    public Harvest createHarvest(@RequestBody Harvest harvest) {
        return harvestService.createHarvest(harvest);
    }

    @PutMapping("/updateHarvest/{id}")
    public Harvest updateHarvest(@RequestBody Harvest harvest, @PathVariable("id") long id) {
        return harvestService.updateHarvest(harvest, id);
    }

    @DeleteMapping("/{id}")
    public void deleteHarvest(@PathVariable("id") long id) {
        harvestService.deleteHarvest(id);
    }
}
