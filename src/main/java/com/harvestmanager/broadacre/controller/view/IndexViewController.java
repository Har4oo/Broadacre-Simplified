package com.harvestmanager.broadacre.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexViewController {
    @GetMapping
    public String indexView(Model model){
        model.addAttribute("test",123);
        return "index";
    }
}
