package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.PersonalObservation;

import java.util.List;

public interface PersonalObservationService {
    List<PersonalObservation> getPersonalObservations();
    PersonalObservation getPersonalObservation(long id);
    PersonalObservation createPersonalObservation(PersonalObservation personalObservation);
    PersonalObservation updatePersonalObservation(PersonalObservation personalObservation, long id);
    void deletePersonalObservation(long id);
}
