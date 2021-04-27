package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String name;
    @Column(columnDefinition = "DOUBLE")
    private double cost;
    @OneToMany(mappedBy = "rentType")
    private List<Service> service;

    public RentType(List<Service> service) {
        this.service = service;
    }

    public RentType() {
    }

    public RentType(Long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
