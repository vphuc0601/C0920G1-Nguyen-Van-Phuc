package com.example.case_study.services;

import com.example.case_study.entities.CustomerType;
import com.example.case_study.entities.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    List<EducationDegree> findAll();

    EducationDegree findById(Long id);

    void save(EducationDegree educationDegree);

    void remove(Long id);
}
