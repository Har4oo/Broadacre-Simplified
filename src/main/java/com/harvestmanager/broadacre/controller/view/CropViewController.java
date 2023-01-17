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

    @GetMapping
    public String cropView(Model model){
        System.out.println("all the crops: "+cropService.getCrops().toString());
        model.addAttribute("crops",cropService.getCrops());
        return "/index";
    }
    @GetMapping("/createCrop")
    public String createCrop(Model model){
        System.out.println("going to create crop html");
        model.addAttribute("crop",new Crop());
        System.out.println(model.toString());
        return "/crop/createCrop";
    }
    @PostMapping("/post/createCrop")
    public String createCrop(@ModelAttribute Crop crop){
        System.out.println("created: "+crop);
        System.out.println("sort created");
        cropService.createCrop(crop);
        return "redirect:/index";
    }
    @GetMapping("/editCrop/{id}")
    public String editSort(Model model, @PathVariable long id){
        System.out.println("crop edit html");
        model.addAttribute("crop",cropService.getCrop(id));
        return "/crop/editCrop";
    }
    @PostMapping("/put/updateCrop/{id}")
    public String updateCrop(@PathVariable long id, @ModelAttribute Crop crop){
        System.out.println("updating value");
        cropService.updateCrop(crop,id);
        return "redirect:/index";
    }
    @GetMapping("/deleteCrop/{id}")
    public String deleteCrop(@PathVariable long id){
        cropService.deleteCrop(id);
        return "redirect:/index";
    }
}
