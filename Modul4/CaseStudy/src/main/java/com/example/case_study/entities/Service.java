package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private Double serviceArea;
    private Double serviceCost;
    private int serviceMaxPeople;
    private int rentTypeId;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private int numberOfFloors;

    public Service() {
    }

    public Service(Long id, String serviceName, Double serviceArea, Double serviceCost, int serviceMaxPeople, int rentTypeId,
                   String standardRoom, String descriptionOtherConvenience, String poolArea, int numberOfFloors) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.rentTypeId = rentTypeId;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }
}
