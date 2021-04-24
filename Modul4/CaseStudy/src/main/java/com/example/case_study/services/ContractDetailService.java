package com.example.case_study.services;

import com.example.case_study.entities.Contract;
import com.example.case_study.entities.ContractDetail;
import com.example.case_study.entities.Customer;
import com.example.case_study.entities.Division;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();

    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);

    Page<ContractDetail> findAll(Pageable pageable);

    public Page<ContractDetail> searchContract(String keyword,Pageable pageable);
}
