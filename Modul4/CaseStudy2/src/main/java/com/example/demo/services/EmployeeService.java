package com.example.demo.services;

import com.example.demo.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    public Page<Employee> searchEmployee(String keyword, Pageable pageable);

    Employee findById(Long id);

    void save(Employee employee);

    void remove(Long id);

    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByInputText(String inputSearch, Pageable pageable);

//    double getTotalMoney(Employee employee);
}
