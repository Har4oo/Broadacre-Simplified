package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.service.CropService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class IndexViewController {
    private CropService cropService;
    @GetMapping
    public String cropView(Model model){
        System.out.println("all the crops: "+cropService.getCrops().toString());
        model.addAttribute("crops",cropService.getCrops());
        return "/index";
    }
}
