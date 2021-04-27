package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "attach_service")
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String attachServiceName;
    @Column(columnDefinition = "DOUBLE")
    private double attachServiceCost;
    @Column(columnDefinition = "INT")
    private int attachServiceUnit;
    @Column(columnDefinition = "VARCHAR(255)")
    private String attachServiceStatus;

    @OneToMany(mappedBy = "attachService")
    private List<ContractDetail> contractDetails;

    public AttachService() {
    }

    public AttachService(Long id, String attachServiceName, double attachServiceCost, int attachServiceUnit,
                         String attachServiceStatus) {
        this.id = id;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }
}
