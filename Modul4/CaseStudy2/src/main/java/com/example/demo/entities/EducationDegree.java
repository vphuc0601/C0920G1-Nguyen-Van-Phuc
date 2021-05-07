package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "education_degree_name", columnDefinition = "VARCHAR(255)")
    private String name;
    @OneToMany(mappedBy = "educationDegree", cascade = CascadeType.ALL)
    private Set<Employee> employee;

    public EducationDegree() {
    }
}
