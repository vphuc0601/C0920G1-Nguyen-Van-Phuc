package com.example.demo.repositories;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT p FROM Employee p WHERE CONCAT(p.employeeName, p.employeeAddress) LIKE %?1%")
    Page<Employee> searchEmployee(String keyword, Pageable pageable);
}
