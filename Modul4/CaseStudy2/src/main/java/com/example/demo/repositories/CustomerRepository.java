package com.example.demo.repositories;

import com.example.demo.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("SELECT p FROM Customer p WHERE CONCAT(p.customerName, p.customerAddress) LIKE %?1%")
     Page<Customer> searchCustomer(String keyword, Pageable pageable);
}
