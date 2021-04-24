package com.example.case_study.services;

import com.example.case_study.entities.RentType;
import com.example.case_study.entities.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAll();

    ServiceType findById(Long id);

    void save(ServiceType serviceType);

    void remove(Long id);
}
