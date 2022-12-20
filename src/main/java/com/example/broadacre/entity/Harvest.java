package com.example.broadacre.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Harvest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int harvestId;

    @Column(nullable = false)
    private int kilograms;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Crop crop;
}
