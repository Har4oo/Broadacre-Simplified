package com.harvestmanager.broadacre.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

public class CropDTO {

    private String cropName;

    private int seedlingsNumber;

    private boolean active;


    private String photoUrl;

    private Soil soil;


    private PlantStage plantStage;


    private Location location;


    private CropType cropType;

    private int sortId;

    public CropDTO(String cropName, int seedlingsNumber, boolean active, String photoUrl, Soil soil, PlantStage plantStage, Location location, CropType cropType, int sortId) {
        this.cropName = cropName;
        this.seedlingsNumber = seedlingsNumber;
        this.active = active;
        this.photoUrl = photoUrl;
        this.soil = soil;
        this.plantStage = plantStage;
        this.location = location;
        this.cropType = cropType;
        this.sortId = sortId;
    }

    public CropDTO() {
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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

    public CropType getCropType() {
        return cropType;
    }

    public void setCropType(CropType cropType) {
        this.cropType = cropType;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
}
