package com.harvestmanager.broadacre.repository;

import com.harvestmanager.broadacre.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
