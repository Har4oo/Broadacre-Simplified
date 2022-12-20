package com.harvestmanager.broadacre.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class PersonalObservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateCreated;

    @Column(nullable = false, length = 500)
    private String result;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Crop crop;

}
