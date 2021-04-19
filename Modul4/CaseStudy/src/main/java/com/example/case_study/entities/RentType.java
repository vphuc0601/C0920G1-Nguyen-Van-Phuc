package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double cost;

    public RentType() {
    }

    public RentType(Long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
