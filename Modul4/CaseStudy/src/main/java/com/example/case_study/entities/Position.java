package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "position")
    private Set<Employee> employees;

    public Position(Set<Employee> employees) {
        this.employees = employees;
    }

    public Position() {
    }

    public Position(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
