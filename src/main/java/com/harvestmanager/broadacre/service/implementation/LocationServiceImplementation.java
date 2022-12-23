package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.repository.LocationRepository;
import com.harvestmanager.broadacre.service.LocationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class LocationServiceImplementation implements LocationService {
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocations() {
        System.out.println("Listing current locations");
        return locationRepository.findAll();
    }

    @Override
    public Location getLocation(long id) {
        System.out.println("Listing location by ID given");
        return locationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public Location createLocation(Location location) {
        System.out.println("Creating a new location");
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location, long id) {
        System.out.println("Updating location");
        location.setLocationId(id);
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(long id) {
        System.out.println("Deleting location");
        locationRepository.deleteById(id);
    }
}
