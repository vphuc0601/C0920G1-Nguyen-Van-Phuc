package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "contract_id" , referencedColumnName = "id" , nullable = false)
    private Contract contract;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "attach_service_id" , referencedColumnName = "id" , nullable = false)
    private AttachService attachService;

    public ContractDetail(Contract contract, AttachService attachService) {
        this.contract = contract;
        this.attachService = attachService;
    }

    public ContractDetail() {
    }

    public ContractDetail(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
