package com.harvestmanager.broadacre.controller.view;

import com.harvestmanager.broadacre.entity.Location;
import com.harvestmanager.broadacre.entity.PlantStage;
import com.harvestmanager.broadacre.entity.Soil;
import com.harvestmanager.broadacre.entity.Sort;
import com.harvestmanager.broadacre.service.*;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sort")
@AllArgsConstructor
public class SortViewController {
    private SortService sortService;

    private CropTypeService cropTypeService;

    @GetMapping
    public String sortView(Model model){
        System.out.println("all the sorts: "+sortService.getSorts().toString());
        model.addAttribute("sorts",sortService.getSorts());
        return "/sort/sort";
    }
    @GetMapping("/createSort")
    public String createSort(Model model){
        System.out.println("going to create sort html");
        model.addAttribute("sort",new Sort());
        model.addAttribute("cropTypes",cropTypeService.getCropTypes());
        System.out.println(model.toString());
        return "/sort/createSort";
    }
    @PostMapping("/post/createSort")
    public String createSort(@ModelAttribute Sort sort){
        System.out.println("created: "+sort);
        System.out.println("sort created");
        sortService.createSort(sort);
        return "redirect:/sort";
    }
    @GetMapping("/editSort/{id}")
    public String editSort(Model model, @PathVariable long id){
        System.out.println("sort edit html");
        model.addAttribute("sort",sortService.getSort(id));
        return "/sort/editSort";
    }
    @PostMapping("/put/updateSort/{id}")
    public String updateSort(@PathVariable long id, @ModelAttribute Sort sort){
        System.out.println("updating value");
        sortService.updateSort(sort,id);
        return "redirect:/sort";
    }
    @GetMapping("/deleteSort/{id}")
    public String deleteSort(@PathVariable long id){
        sortService.deleteSort(id);
        return "redirect:/sort";
    }
}
