package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.Harvest;

import java.util.List;

public interface HarvestService {
    List<Harvest> getHarvests();
    Harvest getHarvest(long id);
    Harvest createHarvest(Harvest harvest);
    Harvest updateHarvest(Harvest harvest, long id);
    void deleteHarvest(long id);
}
