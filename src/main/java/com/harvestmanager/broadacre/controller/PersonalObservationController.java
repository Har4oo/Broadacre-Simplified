package com.harvestmanager.broadacre.controller;

import com.harvestmanager.broadacre.entity.PersonalObservation;
import com.harvestmanager.broadacre.service.PersonalObservationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/personalObservation")
public class PersonalObservationController {
    private PersonalObservationService personalObservationService;

    @GetMapping("/personalObservationList")
    public List<PersonalObservation> getPersonalObservations(){
        return personalObservationService.getPersonalObservations();
    }

    @GetMapping("/personalObservation/{id}")
    public PersonalObservation getPersonalObservation(@PathVariable("id") long id){
        return personalObservationService.getPersonalObservation(id);
    }

    @PostMapping("/createPersonalObservation")
    public PersonalObservation createPersonalObservation(@RequestBody PersonalObservation personalObservation){
        return personalObservationService.createPersonalObservation(personalObservation);
    }

    @PutMapping("/updatePersonalObservation/{id}")
    public PersonalObservation updatePersonalObservation(@RequestBody PersonalObservation personalObservation, @PathVariable("id") long id){
        return personalObservationService.updatePersonalObservation(personalObservation, id);
    }

    @DeleteMapping("/deletePersonalObservation/{id}")
    public void deletePersonalObservation(@PathVariable("id") long id){
        personalObservationService.deletePersonalObservation(id);
    }
}
