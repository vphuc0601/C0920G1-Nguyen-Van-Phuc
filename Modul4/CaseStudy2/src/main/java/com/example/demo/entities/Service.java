package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "service_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @Column(name = "service_area", columnDefinition = "INT")
    private String area;
    @Column(name = "service_cost", columnDefinition = "DOUBLE")
    private Double cost;
    @Column(name = "service_max_people", columnDefinition = "INT")
    private Integer maxPeople;
    @Column(name = "standard_room", columnDefinition = "VARCHAR(255)")
    private String standardRoom;
    @Column(name = "description_other_convenience", columnDefinition = "VARCHAR(255)")
    private String desciption;
    @Column(name = "pool_area", columnDefinition = "DOUBLE")
    private Double poolArea;
    @Column(name = "number_of_floor", columnDefinition = "INT")
    private Integer numberOfFloor;

    @ManyToOne
    @JoinColumn(name = "service_type_id", referencedColumnName = "id")
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    private RentType rentType;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private Set<Contract> contract;

    public Service() {
    }

    public Service(Long id, String name, String area, Double cost, Integer maxPeople, String standardRoom, String desciption,
                   Double poolArea, Integer numberOfFloor) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.standardRoom = standardRoom;
        this.desciption = desciption;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }
}
