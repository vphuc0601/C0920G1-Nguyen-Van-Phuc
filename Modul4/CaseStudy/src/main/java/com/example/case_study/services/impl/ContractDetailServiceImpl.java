package com.example.case_study.services.impl;

import com.example.case_study.entities.Contract;
import com.example.case_study.entities.ContractDetail;
import com.example.case_study.entities.Customer;
import com.example.case_study.repositories.ContractDetailRepository;
import com.example.case_study.services.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    private ContractDetailRepository contractDetailRepository;
    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(Long id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }


    @Override
    public void remove(Long id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public Page<ContractDetail> searchContract(String keyword, Pageable pageable) {
        return contractDetailRepository.search(keyword, pageable);
    }
}
