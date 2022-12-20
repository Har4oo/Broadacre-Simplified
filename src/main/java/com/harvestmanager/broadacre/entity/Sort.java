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
    @Column(nullable = false)
    private String origin;

    @OneToMany(mappedBy = "sort")
    @JsonIgnore
    @Column(nullable = false)
    private List<Crop> crops;

    public long getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }
}
