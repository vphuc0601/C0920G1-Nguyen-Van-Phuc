package com.example.case_study.repositories;

import com.example.case_study.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("select s from Customer s where s.customer_name =:input ")
    Page<Customer> findByName(@Param("input") String name, Pageable pageable);
}
