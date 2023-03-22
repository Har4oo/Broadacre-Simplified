package com.harvestmanager.broadacre.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
public class CropType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cropTypeId;

    @Column(nullable = false)
    private String cropTypeName;

    @OneToMany(mappedBy = "cropType")
    @JsonIgnore
    @Column(nullable = false)
    private List<Crop> crops;

    public long getCropTypeId() {
        return cropTypeId;
    }

    public void setCropTypeId(long cropTypeId) {
        this.cropTypeId = cropTypeId;
    }

    public String getCropTypeName() {
        return cropTypeName;
    }

    public void setCropTypeName(String cropTypeName) {
        this.cropTypeName = cropTypeName;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }
}
