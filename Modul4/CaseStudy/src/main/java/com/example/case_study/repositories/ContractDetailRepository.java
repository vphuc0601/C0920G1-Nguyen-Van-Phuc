package com.example.case_study.repositories;

import com.example.case_study.entities.ContractDetail;
import com.example.case_study.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractDetailRepository extends JpaRepository<ContractDetail,Long> {
    @Query("SELECT p FROM ContractDetail p WHERE CONCAT(p.id, p.quantity) LIKE %?1%")
    public Page<ContractDetail> search(String keyword, Pageable pageable);
}
