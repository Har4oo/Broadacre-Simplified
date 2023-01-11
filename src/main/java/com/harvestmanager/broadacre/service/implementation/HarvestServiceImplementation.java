package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.Harvest;
import com.harvestmanager.broadacre.repository.HarvestRepository;
import com.harvestmanager.broadacre.service.HarvestService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HarvestServiceImplementation implements HarvestService {
    private HarvestRepository harvestRepository;
    @Override
    public List<Harvest> getHarvests() {
        System.out.println("Listing all harvests");
        return harvestRepository.findAll();
    }

    @Override
    public Harvest getHarvest(long id) {
        System.out.println("Listing harvest by ID given");
        return harvestRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public Harvest createHarvest(Harvest harvest) {
        System.out.println("Creating new harvest");
        return harvestRepository.save(harvest);
    }

    @Override
    public Harvest updateHarvest(Harvest harvest, long id) {
        System.out.println("Updating harvest");
        harvest.setHarvestId(id);
        return harvestRepository.save(harvest);
    }

    @Override
    public void deleteHarvest(long id) {
        System.out.println("Deleting a harvest");
        harvestRepository.deleteById(id);
    }
}
