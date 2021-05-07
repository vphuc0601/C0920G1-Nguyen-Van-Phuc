package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "position_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private Set<Employee> employee;
    public Position() {
    }
}
