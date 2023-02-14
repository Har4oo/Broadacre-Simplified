package com.harvestmanager.broadacre.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Harvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long harvestId;

    @Column(nullable = false)
    private int kilograms;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateCreated;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(nullable = false, name = "crop_id")
    private Crop crop;

    public long getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(long harvestId) {
        this.harvestId = harvestId;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "harvestId=" + harvestId +
                ", kilograms=" + kilograms +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
