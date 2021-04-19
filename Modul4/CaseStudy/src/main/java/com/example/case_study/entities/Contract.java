package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date contractStartDate;
    private Date contractEndDate;
    private double contractDeposit;
    private double contractTotalMoney;

    public Contract() {
    }

    public Contract(Long id, Date contractStartDate, Date contractEndDate, double contractDeposit, double contractTotalMoney) {
        this.id = id;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
    }
}
