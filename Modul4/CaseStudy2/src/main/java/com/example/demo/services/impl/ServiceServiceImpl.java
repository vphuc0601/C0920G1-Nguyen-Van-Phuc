package com.example.demo.services.impl;

import com.example.demo.entities.Service;
import com.example.demo.services.ServiceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Override
    public Page<Service> searchService(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Service findById(Long id) {
        return null;
    }

    @Override
    public void save(Service service) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Page<Service> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Service> findByInputText(String inputSearch, Pageable pageable) {
        return null;
    }

//    @Override
//    public double getTotalMoney(Service service) {
//        return 0;
//    }
}
