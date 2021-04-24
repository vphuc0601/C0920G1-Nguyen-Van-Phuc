package com.example.case_study.repositories;

import com.example.case_study.entities.Customer;
import com.example.case_study.entities.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
    @Query("SELECT p FROM Service p WHERE CONCAT(p.serviceName, p.serviceMaxPeople) LIKE %?1%")
    public Page<Service> search(String keyword, Pageable pageable);
}
