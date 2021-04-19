package com.example.case_study.services;

import com.example.case_study.entities.Customer;
import com.example.case_study.entities.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(Long id);

    void save(CustomerType customerType);

    void remove(Long id);

}
