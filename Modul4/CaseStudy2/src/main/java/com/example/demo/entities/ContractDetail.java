package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", columnDefinition = "VARCHAR(255)")
    private String quantity;

    @OneToOne
    @JoinColumn(name = "attach_service_id", referencedColumnName = "id")
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "id")
    private Contract contract;

    public ContractDetail() {
    }

}
