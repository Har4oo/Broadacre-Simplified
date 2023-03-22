package com.harvestmanager.broadacre.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sortId;
    @Column(nullable = false)
    private String sortName;

    @ManyToOne
    @JoinColumn(nullable = false, name = "cropType_id")
    private CropType cropType;
    @Column(nullable = false)
    private String origin;

    @Column(nullable = false, length = 10000)
    private String sortDescription;

    @OneToMany(mappedBy = "sort")
    @JsonIgnore
    @Column(nullable = false)
    private List<Crop> crops;

    public long getSortId() {
        return sortId;
    }

    public void setSortId(long sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public CropType getCropType() {
        return cropType;
    }

    public void setCropType(CropType cropType) {
        this.cropType = cropType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }
}
