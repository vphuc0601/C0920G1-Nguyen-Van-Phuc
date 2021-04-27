package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.sql.Time;
import java.time.LocalDate;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @FutureOrPresent(message = "Must be the present or future date")
    @Column(columnDefinition = "DATE")
    private LocalDate contractStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future(message = "Must be the future date")
    @Column(columnDefinition = "DATE")
    private LocalDate contractEndDate;

    @NotNull(message = "Deposit not empty")
    @Positive(message = "Deposit incorrect format")
    @Column(columnDefinition = "DOUBLE")
//    @Pattern(regexp = "^[0-9]*[1-9][0-9]*(\\\\.[0-9]+)?$", message = "Deposit incorrect format")
    private double contractDeposit;

//    @NotNull(message = "Not empty")
//    @Positive(message = "Total money incorrect format")
//    @Pattern(regexp = "^[0-9]*[1-9][0-9]*(\\\\.[0-9]+)?$", message = "Total money not format")
@Column(columnDefinition = "DOUBLE")
    private double contractTotalMoney;

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

    public Contract(Long id, LocalDate contractStartDate, LocalDate contractEndDate, double contractDeposit, double contractTotalMoney) {
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
        Contract contract = (Contract) target;

        LocalDate localDateInput1 = contract.contractStartDate;
        LocalDate localDateInput2 = contract.contractEndDate;


        if (localDateInput1 == null || localDateInput2 == null) {
            errors.rejectValue("contractStartDate", "DateNotNull");
            errors.rejectValue("contractEndDate", "DateNotNull");
        }   else {
            if (localDateInput2.isBefore(localDateInput1)) {
                errors.rejectValue("contractEndDate", "EndDateMustAfterOrEqualStartDate");
            }
        }
    }
}

