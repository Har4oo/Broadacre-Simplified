package com.harvestmanager.broadacre.repository;

import com.harvestmanager.broadacre.entity.Harvest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HarvestRepository extends JpaRepository<Harvest,Long> {
}
