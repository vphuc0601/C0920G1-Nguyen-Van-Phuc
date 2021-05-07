package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "customer_type_id")
//    private Customer customer;
    @OneToMany(mappedBy = "customerType", cascade = CascadeType.ALL)
    private Set<Customer> customers;


    public CustomerType() {
    }

    public CustomerType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
