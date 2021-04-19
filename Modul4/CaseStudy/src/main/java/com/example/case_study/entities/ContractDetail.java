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

    public ContractDetail() {
    }

    public ContractDetail(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
