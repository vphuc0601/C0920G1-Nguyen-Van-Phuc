package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String name;

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employees;

    public EducationDegree(Set<Employee> employees) {
        this.employees = employees;
    }

    public EducationDegree() {
    }

    public EducationDegree(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
