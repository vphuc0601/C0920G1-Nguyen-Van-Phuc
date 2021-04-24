package com.example.case_study.services;

import com.example.case_study.entities.CustomerType;
import com.example.case_study.entities.RentType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RentTypeService {
    List<RentType> findAll();

    RentType findById(Long id);

    void save(RentType rentType);

    void remove(Long id);
}
