package com.harvestmanager.broadacre.controller.api;

import com.harvestmanager.broadacre.entity.Soil;
import com.harvestmanager.broadacre.entity.Sort;
import com.harvestmanager.broadacre.service.SortService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/sort")
public class SortController {
    private SortService sortService;
    
    @GetMapping("/sortList")
    public List<Sort> getSorts(){
        return sortService.getSorts();
    }
    
    @GetMapping("/{id}")
    public Sort getSort(@PathVariable("id") long id){
        return sortService.getSort(id);
    }

    @GetMapping("/filter/{id}")
    public List<Sort> getSortByCropTypeId(@PathVariable("id") long id){
        System.out.println("filtering sorts and crop by id "+id);
        return sortService.getSortByCropTypeId(id);
    }
    
    @PostMapping("/createSort")
    public Sort createSort(@RequestBody Sort sort){
        return sortService.createSort(sort);
    }
    
    @PutMapping("/updateSort/{id}")
    public Sort updateSort(@RequestBody Sort sort, @PathVariable("id") long id){
        return sortService.updateSort(sort,id);
    }
    
    @DeleteMapping("/deleteSort/{id}")
    public void deletesSort(@PathVariable("id") long id){
        sortService.deleteSort(id);
    }
}
