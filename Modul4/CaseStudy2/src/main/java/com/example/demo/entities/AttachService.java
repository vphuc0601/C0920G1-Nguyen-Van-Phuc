package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "attach_service_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @Column(name = "attach_service_cost", columnDefinition = "DOUBLE")
    private String cost;
    @Column(name = "attach_service_unit", columnDefinition = "INT")
    private String unit;
    @Column(name = "attach_service_status", columnDefinition = "VARCHAR(255)")
    private String status;



    public AttachService() {
    }

    public AttachService(Long id, String name, String cost, String unit, String status) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
    }
}
