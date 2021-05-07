package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "service_type_name", columnDefinition = "VARCHAR(255)")
    private String name;

    @OneToMany(mappedBy = "serviceType", cascade = CascadeType.ALL)
     private Set<Service> services;

    public ServiceType() {
    }

    public ServiceType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
