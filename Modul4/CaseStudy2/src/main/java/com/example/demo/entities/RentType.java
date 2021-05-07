package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rent_type_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @Column(name = "rent_type_cost", columnDefinition = "DOUBLE")
    private String cost;

    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    private Set<Service> services;

    public RentType() {
    }

    public RentType(Long id, String name, String cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
