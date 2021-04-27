package com.example.case_study.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_type_id")
    private Long id;
    @Column(name = "customer_type_name", columnDefinition = "VARCHAR(255)")
    private String name;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customer;

    public CustomerType() {
    }

    public CustomerType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerType(Set<Customer> customer) {
        this.customer = customer;
    }
}
