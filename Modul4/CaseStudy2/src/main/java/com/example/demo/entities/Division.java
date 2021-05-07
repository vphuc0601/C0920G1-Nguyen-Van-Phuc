package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "division_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    Set<Employee> employee;

    public Division() {
    }
}
