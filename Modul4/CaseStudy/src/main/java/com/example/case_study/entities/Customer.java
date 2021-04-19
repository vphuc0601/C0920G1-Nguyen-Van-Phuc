package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_birthday")
    private String customerBirthday;
    @Column(name = "customer_gender")
    private String customerGender;
    @Column(name = "customer_id_card")
    private String customerIdCard;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_type_id")
    private String customerTypeId;
    @Column(name = "customer_address")
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", nullable = false, referencedColumnName = "customer_type_id")
    private CustomerType customerType;


    public Customer() {
    }

    public Customer(Long id, String customerId, String customerName, String customerBirthday, String customerGender,
                    String customerIdCard, String customerPhone, String customerEmail, String customerTypeId,
                    String customerAddress) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerTypeId = customerTypeId;
        this.customerAddress = customerAddress;
    }
}
