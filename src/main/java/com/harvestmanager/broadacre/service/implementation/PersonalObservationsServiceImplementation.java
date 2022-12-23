package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.PersonalObservations;
import com.harvestmanager.broadacre.repository.PersonalObservationsRepository;
import com.harvestmanager.broadacre.service.PersonalObservationsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PersonalObservationsServiceImplementation implements PersonalObservationsService {
    private PersonalObservationsRepository personalObservationsRepository;
    @Override
    public List<PersonalObservations> getPersonalObservations() {
        System.out.println("Listing all current personal observations");
        return personalObservationsRepository.findAll();
    }

    @Override
    public PersonalObservations getPersonalObservation(long id) {
        System.out.println("Listing personal observation by ID");
        return personalObservationsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public PersonalObservations createPersonalObservation(PersonalObservations personalObservations) {
        System.out.println("Creating personal observation");
        personalObservationsRepository.save(personalObservations);
    }

    @Override
    public PersonalObservations updatePersonalObservation(PersonalObservations personalObservations, long id) {
        personalObservations.setPersonalObservationId(id);
        return personalObservationsRepository.save(personalObservations);
    }

    @Override
    public void deletePersonalObservation(long id) {
        personalObservationsRepository.deleteById(id);
    }
}
