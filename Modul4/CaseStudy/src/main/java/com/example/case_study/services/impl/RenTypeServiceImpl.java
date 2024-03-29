package com.example.case_study.services.impl;

import com.example.case_study.entities.RentType;
import com.example.case_study.repositories.RentTypeRepository;
import com.example.case_study.services.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RenTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }

    @Override
    public RentType findById(Long id) {
        return rentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentType rentType) {

    }

    @Override
    public void remove(Long id) {
        rentTypeRepository.deleteById(id);
    }
}
