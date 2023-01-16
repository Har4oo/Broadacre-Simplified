package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/location")
@AllArgsConstructor
public class LocationViewController {
    private LocationService locationService;

    @GetMapping
    public String locationView(Model model){
        System.out.println(locationService.getLocations().toString());
        model.addAttribute("locations",locationService.getLocations());
        return "/location/location";
    }
    @GetMapping("/createLocation")
    public String createLocation(Model model){
        model.addAttribute("location",new Location());
        return "/location/createLocation";
    }
    @PostMapping("/post/createLocation")
    public String createLocation(@ModelAttribute Location location){
        locationService.createLocation(location);
        return "redirect:/location";
    }
    @GetMapping("/editLocation/{id}")
    public String editLocation(Model model, @PathVariable long id){
        model.addAttribute("location",locationService.getLocation(id));
        return "/location/editLocation";
    }
    @PostMapping("/put/updateLocation/{id}")
    public String updateLocation(@PathVariable long id, @ModelAttribute Location location){
        System.out.println("updating value");
        locationService.updateLocation(location,id);
        return "redirect:/location";
    }
    @GetMapping("/deleteLocation/{id}")
    public String deleteLocation(@PathVariable long id){
        locationService.deleteLocation(id);
        return "redirect:/location";
    }
}
