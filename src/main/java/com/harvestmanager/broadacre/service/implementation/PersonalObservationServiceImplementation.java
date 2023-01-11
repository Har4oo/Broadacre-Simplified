package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.PersonalObservation;
import com.harvestmanager.broadacre.repository.PersonalObservationRepository;
import com.harvestmanager.broadacre.service.PersonalObservationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonalObservationServiceImplementation implements PersonalObservationService {
    private PersonalObservationRepository personalObservationRepository;
    @Override
    public List<PersonalObservation> getPersonalObservations() {
        System.out.println("Listing all current personal observations");
        return personalObservationRepository.findAll();
    }

    @Override
    public PersonalObservation getPersonalObservation(long id) {
        System.out.println("Listing personal observation by ID");
        return personalObservationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public PersonalObservation createPersonalObservation(PersonalObservation personalObservation) {
        System.out.println("Creating personal observation");
        return personalObservationRepository.save(personalObservation);
    }

    @Override
    public PersonalObservation updatePersonalObservation(PersonalObservation personalObservation, long id) {
        personalObservation.setPersonalObservationId(id);
        return personalObservationRepository.save(personalObservation);
    }

    @Override
    public void deletePersonalObservation(long id) {
        personalObservationRepository.deleteById(id);
    }
}
