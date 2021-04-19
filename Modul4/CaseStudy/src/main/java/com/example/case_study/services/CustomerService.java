package com.example.case_study.services;

import com.example.case_study.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByInputText(String inputSearch, Pageable pageable);
}
