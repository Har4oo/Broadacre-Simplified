package com.harvestmanager.broadacre.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
public class Soil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long soilId;
    @Column(nullable = false)
    private String soilName;

    @OneToMany(mappedBy = "soil")
    @JsonIgnore
    @Column(nullable = false)
    private List<Crop> crops;

    public long getSoilId() {
        return soilId;
    }

    public void setSoilId(long soilId) {
        this.soilId = soilId;
    }

    public String getSoilName() {
        return soilName;
    }

    public void setSoilName(String soilName) {
        this.soilName = soilName;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }
}

