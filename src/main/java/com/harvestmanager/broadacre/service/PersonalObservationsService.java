package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.PersonalObservations;

import java.util.List;

public interface PersonalObservationsService {
    List<PersonalObservations> getPersonalObservations();
    PersonalObservations getPersonalObservation(long id);
    PersonalObservations createPersonalObservation(PersonalObservations personalObservations);
    PersonalObservations updatePersonalObservation(PersonalObservations personalObservations, long id);
    void deletePersonalObservation(long id);
}
