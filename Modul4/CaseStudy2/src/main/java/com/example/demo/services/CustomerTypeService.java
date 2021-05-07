package com.example.demo.services;

import com.example.demo.entities.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();
}
