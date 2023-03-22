package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.CropType;
import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.CropTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cropType")
@AllArgsConstructor
public class CropTypeViewController {
    private CropTypeService cropTypeService;

    @GetMapping
    public String cropTypeView(Model model){
        System.out.println(cropTypeService.getCropTypes().toString());
        model.addAttribute("cropTypes", cropTypeService.getCropTypes());
        return "/croptype/cropType";
    }

    @GetMapping("/createCropType")
    public String createCropType(Model model) {
        System.out.println("Attempt to create a new CropType");
        model.addAttribute("cropType",new CropType());
        return "/cropType/createCropType";
    }

    @PostMapping("/post/createCropType")
    public String createCropType(@ModelAttribute CropType cropType){
        cropTypeService.createCropType(cropType);
        return "redirect:/cropType";
    }

    @GetMapping("/editCropType/{id}")
    public String editCropType(Model model, @PathVariable long id){
        model.addAttribute("cropType",cropTypeService.getCropType(id));
        return "/cropType/editCropType";
    }

    @PostMapping("/put/updateCropType/{id}")
    public String updateLocation(@PathVariable long id, @ModelAttribute CropType cropType){
        System.out.println("updating value");
        cropTypeService.updateCropType(cropType,id);
        return "redirect:/cropType";
    }
    @GetMapping("/deleteCropType/{id}")
    public String deleteCropType(@PathVariable long id){
        cropTypeService.deleteCropType(id);
        return "redirect:/cropType";
    }
}
