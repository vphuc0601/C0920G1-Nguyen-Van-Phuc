package com.example.demo.services;

import com.example.demo.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> searchCustomer(String keyword, Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByInputText(String inputSearch, Pageable pageable);

//    double getTotalMoney(Customer customer);
}
