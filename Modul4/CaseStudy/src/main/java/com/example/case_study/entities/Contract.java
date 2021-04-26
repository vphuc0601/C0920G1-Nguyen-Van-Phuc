package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "contract")
public class Contract implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @PastOrPresent(message = "asd")
    private Date contractStartDate;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date contractEndDate;

    @NotNull(message = "Deposit not empty")
    @Pattern(regexp = "^[0-9]*[1-9][0-9]*(\\\\.[0-9]+)?$", message = "Deposit incorrect format")
    private String contractDeposit;

    @NotNull(message = "Not empty")
    @Pattern(regexp = "^[0-9]*[1-9][0-9]*(\\\\.[0-9]+)?$", message = "Total money not format")
    private String contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public Contract(Employee employee, Customer customer, Service service, Set<ContractDetail> contractDetails) {
        this.employee = employee;
        this.customer = customer;
        this.service = service;
        this.contractDetails = contractDetails;
    }

    public Contract(Long id, Date contractStartDate, Date contractEndDate, String contractDeposit, String contractTotalMoney) {
        this.id = id;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Contract.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
