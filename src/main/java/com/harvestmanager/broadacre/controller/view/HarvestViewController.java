package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Harvest;
import com.harvestmanager.broadacre.entity.Location;
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

    @GetMapping
    public String harvestView(Model model){
        System.out.println(harvestService.getHarvests().toString());
        model.addAttribute("harvest",harvestService.getHarvests());
        return "/harvest/harvest";
    }

    @GetMapping("/createHarvest")
    public String createHarvest(Model model){
        model.addAttribute("harvest",new Harvest());
        return "/harvest/createHarvest";
    }

    @PostMapping("/post/createHarvest")
    public String createHarvest(@ModelAttribute Harvest harvest){
        harvestService.createHarvest(harvest);
        return "redirect:/harvest";
    }
    @GetMapping("/editHarvest/{id}")
    public String editHarvest(Model model, @PathVariable long id){
        model.addAttribute("harvest",harvestService.getHarvest(id));
        return "/harvest/editHarvest";
    }
    @PostMapping("/put/updateHarvest/{id}")
    public String updateHarvest(@PathVariable long id, @ModelAttribute Harvest harvest){
        System.out.println("updating value");
        harvestService.updateHarvest(harvest,id);
        return "redirect:/harvest";
    }
    @GetMapping("/deleteHarvest/{id}")
    public String deleteHarvest(@PathVariable long id){
        harvestService.deleteHarvest(id);
        return "redirect:/harvest";
    }
}
