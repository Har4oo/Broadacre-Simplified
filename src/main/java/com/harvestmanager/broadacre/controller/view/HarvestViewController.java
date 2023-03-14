package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Crop;
import com.harvestmanager.broadacre.entity.Harvest;
import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.CropService;
import com.harvestmanager.broadacre.service.HarvestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/harvest")
@AllArgsConstructor
public class HarvestViewController {
    private HarvestService harvestService;
    private CropService cropService;

    @GetMapping
    public String harvestView(Model model) {
        System.out.println(harvestService.getHarvests().toString());
        model.addAttribute("harvests", harvestService.getHarvests());
        model.addAttribute("crops", cropService.getCrops());
        return "/harvest/harvest";
    }

    @GetMapping("/createHarvest/{id}")
    public String createHarvest(Model model, @PathVariable long id) {
        System.out.println("Attempt to create a new Harvest");
        Harvest harvest = new Harvest();
        Crop crop = cropService.getCrop(id);

        harvest.setCrop(crop);

        model.addAttribute("harvest", harvest);
        model.addAttribute("crop",crop);
        return "/harvest/createHarvest";
    }

    @PostMapping("/post/createHarvest")
    public String createHarvest(@ModelAttribute Harvest harvest) {
        System.out.println("Creating new Harvest with values: " + harvest.toString());
        harvestService.createHarvest(harvest);
        return "redirect:/crop/cropDescription/" + harvest.getCrop().getCropId();
    }

    @GetMapping("/editHarvest/{id}")
    public String editHarvest(Model model, @PathVariable long id) {
        System.out.println("Editing harvest with values: " + harvestService.getHarvest(id));
        Harvest harvest = harvestService.getHarvest(id);
        Crop crop = cropService.getCrop(harvest.getCrop().getCropId());

        harvest.setCrop(crop);

        model.addAttribute("harvest", harvest);
        model.addAttribute("crop", crop);
        return "/harvest/editHarvest";
    }

    @PostMapping("/put/updateHarvest/{id}")
    public String updateHarvest(@PathVariable long id, @ModelAttribute Harvest harvest) {
        System.out.println("updating value");
        harvestService.updateHarvest(harvest, id);
        return "redirect:/crop/cropDescription/" + harvest.getCrop().getCropId();
    }

    @GetMapping("/deleteHarvest/{id}")
    public String deleteHarvest(@PathVariable long id) {
        System.out.println("Deleting Harvest with values: "+harvestService.getHarvest(id).toString());
        long cropId = harvestService.getHarvest(id).getCrop().getCropId();
        harvestService.deleteHarvest(id);
        return "redirect:/crop/cropDescription/" + cropId;
    }
}
