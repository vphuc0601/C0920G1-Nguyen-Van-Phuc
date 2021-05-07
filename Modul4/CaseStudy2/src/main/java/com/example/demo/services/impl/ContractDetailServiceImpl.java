package com.example.demo.services.impl;

import com.example.demo.entities.ContractDetail;
import com.example.demo.repositories.ContractDetailRepository;
import com.example.demo.services.ContractDetailService;
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
    public Page<ContractDetail> searchContractDetail(String keyword, Pageable pageable) {
        return null;
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
    public Page<ContractDetail> findByInputText(String inputSearch, Pageable pageable) {
        return null;
    }

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}
