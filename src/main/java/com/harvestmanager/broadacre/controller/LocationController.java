package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.LocationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/location")
public class LocationController {
    private LocationService locationService;

    @GetMapping("/locationList")
    public List<Location> getLocations() {
        return locationService.getLocations();
    }

    @GetMapping("/location/{id}")
    public Location getLocation(@PathVariable("id") long id) {
        return locationService.getLocation(id);
    }

    @PostMapping("/createLocation")
    public Location createLocation(@RequestBody Location location){
        return locationService.createLocation(location);
    }
    @PutMapping("/updateLocation/{id}")
    public Location updateLocation(@RequestBody Location location, @PathVariable("id") long id){
        return locationService.updateLocation(location,id);
    }
    @DeleteMapping("/deleteLocation/{id}")
    public void deleteLocation(@PathVariable("id") long id){
        locationService.deleteLocation(id);
    }
}
