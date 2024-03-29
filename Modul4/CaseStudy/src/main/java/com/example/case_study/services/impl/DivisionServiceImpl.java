package com.example.case_study.services.impl;

import com.example.case_study.entities.Division;
import com.example.case_study.repositories.DivisionRepository;
import com.example.case_study.services.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Division findById(Long id) {
        return divisionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public void remove(Long id) {
        divisionRepository.deleteById(id);
    }
}
