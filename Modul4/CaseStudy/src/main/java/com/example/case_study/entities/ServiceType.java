package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "serviceType")
    private List<Service> service;

    public ServiceType() {
    }

    public ServiceType(List<Service> service) {
        this.service = service;
    }

    public ServiceType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
