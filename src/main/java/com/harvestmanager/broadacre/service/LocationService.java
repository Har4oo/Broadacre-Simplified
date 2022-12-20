package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> getLocations();
    Location getLocation(long id);
    Location createLocation(Location location);
    Location updateLocation(Location location, long id);
    void deleteLocation(long id);
}
