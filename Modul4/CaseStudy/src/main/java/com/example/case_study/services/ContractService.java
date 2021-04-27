package com.example.case_study.services;

import com.example.case_study.entities.Contract;
import com.example.case_study.entities.ContractDetail;
import com.example.case_study.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractService {
    public Page<Contract> search(String keyword, Pageable pageable);

    Contract findById(Long id);

    void save(Contract contract);

    void remove(Long id);

    Page<Contract> findAll(Pageable pageable);

    Page<Contract> findByInputText(String inputSearch, Pageable pageable);

    double getTotalMoney(Contract contract);

}
