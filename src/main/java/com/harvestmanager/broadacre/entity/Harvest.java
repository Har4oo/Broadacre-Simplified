package com.harvestmanager.broadacre.entity;

import javax.persistence.*;

@Entity
public class Harvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long harvestId;

    @Column(nullable = false)
    private int kilograms;

    @ManyToOne
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

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }
}
