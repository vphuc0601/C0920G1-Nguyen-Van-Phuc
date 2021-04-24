package com.example.case_study.repositories;

import com.example.case_study.entities.Contract;
import com.example.case_study.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractRepository extends JpaRepository<Contract,Long> {
    @Query("SELECT p FROM Contract p WHERE CONCAT(p.contractDeposit) LIKE %?1%")
    public Page<Contract> search(String keyword, Pageable pageable);
}
