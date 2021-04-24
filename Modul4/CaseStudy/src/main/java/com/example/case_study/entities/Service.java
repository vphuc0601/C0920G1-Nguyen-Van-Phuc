package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private String serviceId;
    private Double serviceArea;
    private Double serviceCost;
    private int serviceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private int numberOfFloors;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;

    @OneToMany(mappedBy = "service")
    private List<Contract> contracts;

    public Service() {
    }

    public Service(Long id,String serviceId, String serviceName, Double serviceArea, Double serviceCost, int serviceMaxPeople,
                   String standardRoom, String descriptionOtherConvenience, String poolArea, int numberOfFloors) {
        this.id = id;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceArea = serviceArea;
        this.serviceCost = serviceCost;
        this.serviceMaxPeople = serviceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Service(ServiceType serviceType, RentType rentType, List<Contract> contracts) {
        this.serviceType = serviceType;
        this.rentType = rentType;
        this.contracts = contracts;
    }
}
