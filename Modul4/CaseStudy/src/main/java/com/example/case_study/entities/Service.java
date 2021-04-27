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
    @Column(columnDefinition = "VARCHAR(255)")
    private String serviceName;
    @Column(columnDefinition = "VARCHAR(255)")
    private String serviceId;
    @Column(columnDefinition = "DOUBLE")
    private Double serviceArea;
    @Column(columnDefinition = "DOUBLE")
    private Double serviceCost;
    @Column(columnDefinition = "INT")
    private int serviceMaxPeople;
    @Column(columnDefinition = "VARCHAR(255)")
    private String standardRoom;
    @Column(columnDefinition = "VARCHAR(255)")
    private String descriptionOtherConvenience;
    @Column(columnDefinition = "VARCHAR(255)")
    private String poolArea;
    @Column(columnDefinition = "INT")
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
