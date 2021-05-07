package com.example.demo.services;

import com.example.demo.entities.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
     Page<ContractDetail> searchContractDetail(String keyword, Pageable pageable);

    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);

    Page<ContractDetail> findAll(Pageable pageable);

    Page<ContractDetail> findByInputText(String inputSearch, Pageable pageable);

    List<ContractDetail> findAll();
}
