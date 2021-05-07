package com.example.demo.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "contract_start_date", columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @Column(name = "contract_end_date", columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    @Column(name = "contract_deposit", columnDefinition = "DOUBLE")
    private String deposit;
    @Column(name = "contract_total_money", columnDefinition = "DOUBLE")
    private String totalMoney;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
    private Set<ContractDetail> contractDetail;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

}
