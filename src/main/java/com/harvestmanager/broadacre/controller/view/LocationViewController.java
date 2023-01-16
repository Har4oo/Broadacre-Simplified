package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
