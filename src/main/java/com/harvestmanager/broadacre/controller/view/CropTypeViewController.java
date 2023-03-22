package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.CropType;
import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.service.CropTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
