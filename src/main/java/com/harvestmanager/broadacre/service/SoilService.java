package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.Soil;

import java.util.List;

public interface SoilService {
    List<Soil> getSoils();
    Soil getSoil(long id);
    Soil createSoil(Soil soil);
    Soil updateSoil(Soil soil, long id);
    void deleteSoil(long id);
}
