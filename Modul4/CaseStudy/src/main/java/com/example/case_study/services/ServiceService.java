package com.example.case_study.services;

import com.example.case_study.entities.Customer;
import com.example.case_study.entities.Division;
import com.example.case_study.entities.Position;
import com.example.case_study.entities.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@org.springframework.stereotype.Service
public interface ServiceService  {
    public Page<Service> searchService(String keyword,Pageable pageable);

    Service findById(Long id);

    void save(Service service);

    void remove(Long id);

    Page<Service> findAll(Pageable pageable);

    List<Service> findAll();

    Page<Service> findByInputText(String inputSearch, Pageable pageable);
}
