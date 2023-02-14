package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.*;
import com.harvestmanager.broadacre.service.*;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/crop")
@AllArgsConstructor
public class CropViewController {
    private CropService cropService;
    private SoilService soilService;
    private PlantStageService plantStageService;
    private SortService sortService;
    private LocationService locationService;
    private PersonalObservationService personalObservationService;
    private HarvestService harvestService;

    @GetMapping("/createCrop")
    public String createCrop(Model model) {
        System.out.println("going to create crop html");
        model.addAttribute("crop", new Crop());
        model.addAttribute("soils", soilService.getSoils());
        model.addAttribute("sorts", sortService.getSorts());
        model.addAttribute("locations", locationService.getLocations());
        model.addAttribute("plantStages", plantStageService.getPlantStages());
        System.out.println(model.toString());
        return "/crop/createCrop";
    }

    @PostMapping("/post/createCrop")
    public String createCrop(@ModelAttribute Crop crop) {
        System.out.println("created crop: " + crop);
        System.out.println("crop created");
        cropService.createCrop(crop);
        return "redirect:/";
    }

    @GetMapping("/editCrop/{id}")
    public String editSort(Model model, @PathVariable long id) {
        System.out.println("crop edit html");
        model.addAttribute("crop", cropService.getCrop(id));
        model.addAttribute("soils", soilService.getSoils());
        model.addAttribute("sorts", sortService.getSorts());
        model.addAttribute("locations", locationService.getLocations());
        model.addAttribute("plantStages", plantStageService.getPlantStages());
        return "/crop/editCrop";
    }

    @PostMapping("/put/updateCrop/{id}")
    public String updateCrop(@PathVariable long id, @ModelAttribute Crop crop) {
        System.out.println("updating value");
        cropService.updateCrop(crop, id);
        return "redirect:/";
    }

    @GetMapping("/deleteCrop/{id}")
    public String deleteCrop(@PathVariable long id) {
        cropService.deleteCrop(id);
        return "redirect:/";
    }

    @GetMapping("/cropDescription/{id}")
    public String cropDescription(Model model, @PathVariable long id) {
        System.out.println("Adding Crop with ID " + cropService.getCrop(id).getCropId() + " to the model");
        model.addAttribute("crop", cropService.getCrop(id));
        System.out.println("Adding PersonalObservations to Crop's model with current ID");
        System.out.println(cropService.getCrop(id).getPersonalObservations());
        model.addAttribute("personalObservations", cropService.getCrop(id).getPersonalObservations());
        System.out.println("Adding Harvest to Crop's model with current ID  ");
        System.out.println(cropService.getCrop(id).getHarvests());
        model.addAttribute("harvests", cropService.getCrop(id).getHarvests());

        return "/crop/cropDescription";
    }
}
