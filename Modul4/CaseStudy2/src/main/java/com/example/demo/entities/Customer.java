package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_id",columnDefinition = "VARCHAR(255)")
    private String customerId;
    @Column(name = "customer_name",columnDefinition = "VARCHAR(255)")
    private String customerName;
    @Column(name="customer_birthday",columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthday;
    @Column(name = "customer_gender",columnDefinition = "VARCHAR(255)")
    private String customerGender;
    @Column(name = "customer_id_card",columnDefinition = "VARCHAR(255)")
    private String customerIdCard;
    @Column(name = "customer_phone",columnDefinition = "VARCHAR(255)")
    private String customerPhone;
    @Column(name = "customer_email",columnDefinition = "VARCHAR(255)")
    private String customerEmail;
    @Column(name = "customer_address",columnDefinition = "VARCHAR(255)")
    private String customerAddress;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private Set<CustomerType> customerType;
    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "id")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Contract> contract;

    public Customer() {
    }

    public Customer(Long id, String customerId, String customerName, Date customerBirthday, String customerGender,
                    String customerIdCard, String customerPhone, String customerEmail, String customerAddress)
    {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
}
