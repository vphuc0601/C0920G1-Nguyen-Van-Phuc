package com.example.demo.services;

import com.example.demo.entities.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceService {
    public Page<Service> searchService(String keyword, Pageable pageable);

    Service findById(Long id);

    void save(Service service);

    void remove(Long id);

    Page<Service> findAll(Pageable pageable);

    Page<Service> findByInputText(String inputSearch, Pageable pageable);

//    double getTotalMoney(Service service);
}
