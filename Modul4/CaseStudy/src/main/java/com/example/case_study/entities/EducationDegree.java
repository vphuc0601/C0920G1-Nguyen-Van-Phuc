package com.example.case_study.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public EducationDegree() {
    }

    public EducationDegree(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
