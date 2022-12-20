package com.harvestmanager.broadacre.repository;

import com.harvestmanager.broadacre.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, Long> {
}
