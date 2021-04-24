package com.example.case_study.services;

import com.example.case_study.entities.CustomerType;
import com.example.case_study.entities.Division;

import java.util.List;

public interface DivisionService {
    List<Division> findAll();

    Division findById(Long id);

    void save(Division division);

    void remove(Long id);
}
