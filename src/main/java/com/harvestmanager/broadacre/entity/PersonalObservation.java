package com.harvestmanager.broadacre.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class PersonalObservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personalObservationId;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateCreated;

    @Column(nullable = false, length = 500)
    private String result;

    @ManyToOne
    @JoinColumn(nullable = false, name = "crop_id")
    private Crop crop;

    public long getPersonalObservationId() {
        return personalObservationId;
    }

    public void setPersonalObservationId(long personalObservationId) {
        this.personalObservationId = personalObservationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
}
