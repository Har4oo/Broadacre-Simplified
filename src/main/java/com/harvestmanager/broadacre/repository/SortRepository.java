package com.harvestmanager.broadacre.repository;

import com.harvestmanager.broadacre.entity.CropType;
import com.harvestmanager.broadacre.entity.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SortRepository extends JpaRepository<Sort,Long> {
}
