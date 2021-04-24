package com.example.case_study.services;

import com.example.case_study.entities.Customer;
import com.example.case_study.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    public Page<Employee> searchEmployee(String keyword, Pageable pageable);

    Employee findById(Long id);

    void save(Employee employee);

    void remove(Long id);

    Page<Employee> findAll(Pageable pageable);

    List<Employee> findAll();


}
