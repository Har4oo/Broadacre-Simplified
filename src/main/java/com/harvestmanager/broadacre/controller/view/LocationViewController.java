package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/location")
@AllArgsConstructor
public class LocationViewController {
    private LocationService locationService;


}
