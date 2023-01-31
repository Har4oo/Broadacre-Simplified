package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Harvest;
import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.entity.PersonalObservation;
import com.harvestmanager.broadacre.service.CropService;
import com.harvestmanager.broadacre.service.HarvestService;
import com.harvestmanager.broadacre.service.PersonalObservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/personalObservation")
@AllArgsConstructor
public class PersonalObservationViewController {
    private PersonalObservationService personalObservationService;
    private CropService cropService;

    @GetMapping
    public String harvestView(Model model){
        System.out.println(personalObservationService.getPersonalObservations().toString());
        model.addAttribute("personalObservations",personalObservationService.getPersonalObservations());
        model.addAttribute("crops",cropService.getCrops());
        return "/personalobservation/personalObservation";
    }

    @GetMapping("/createPersonalObservation")
    public String createPersonalObservation(Model model){
        model.addAttribute("personalObservation",new PersonalObservation());
        model.addAttribute("crops",cropService.getCrops());
        return "/personalobservation/createPersonalObservation";
    }

    @PostMapping("/post/createPersonalObservation")
    public String createPersonalObservation(@ModelAttribute PersonalObservation personalObservation){
        personalObservationService.createPersonalObservation(personalObservation);
        return "redirect:/personalObservation";
    }
    @GetMapping("/editPersonalObservation/{id}")
    public String editPersonalObservation(Model model, @PathVariable long id){
        model.addAttribute("personalObservation",personalObservationService.getPersonalObservation(id));
        model.addAttribute("crops",cropService.getCrops());
        return "/personalobservation/editPersonalObservation";
    }
    @PostMapping("/put/updatePersonalObservation/{id}")
    public String updatePersonalObservation(@PathVariable long id, @ModelAttribute PersonalObservation personalObservation){
        personalObservationService.updatePersonalObservation(personalObservation,id);
        System.out.println("updating value " + personalObservationService.getPersonalObservation(id).toString());
        return "redirect:/personalObservation";
    }
    @GetMapping("/deletePersonalObservation/{id}")
    public String deletePersonalObservation(@PathVariable long id){
        personalObservationService.deletePersonalObservation(id);
        return "redirect:/personalObservation";
    }

    @GetMapping("/viewPersonalObservation/{id}")
    public String viewPersonalObservation(@PathVariable long id){
        personalObservationService.getPersonalObservation(id);
        return "/personalobservation/viewPersonalObservation";
    }
}
