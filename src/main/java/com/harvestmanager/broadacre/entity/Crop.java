package com.harvestmanager.broadacre.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cropId;
    @Column(nullable = false)
    private String cropName;
    @Column(nullable = false)
    private int seedlingsNumber;
    @Column(nullable = false)
    private boolean active;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Soil soil;

    @ManyToOne
    @JoinColumn(nullable = false)
    private PlantStage plantStage;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Sort sort;

    @OneToMany(mappedBy = "crop")
    @JsonIgnore
    @Column(nullable = false)
    private List<PersonalObservations> personalObservations;

    @OneToMany(mappedBy = "crop")
    @JsonIgnore
    @Column(nullable = false)
    private List<Harvest> harvests;

    public long getCropId() {
        return cropId;
    }

    public void setCropId(long cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public int getSeedlingsNumber() {
        return seedlingsNumber;
    }

    public void setSeedlingsNumber(int seedlingsNumber) {
        this.seedlingsNumber = seedlingsNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public PlantStage getPlantStage() {
        return plantStage;
    }

    public void setPlantStage(PlantStage plantStage) {
        this.plantStage = plantStage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
