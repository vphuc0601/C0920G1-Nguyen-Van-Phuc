package com.example.demo.services.impl;

import com.example.demo.entities.Contract;
import com.example.demo.repositories.ContractRepository;
import com.example.demo.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Override
    public Page<Contract> search(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Contract findById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Page<Contract> findByInputText(String inputSearch, Pageable pageable) {
        return null;
    }

//    @Override
//    public double getTotalMoney(Contract contract) {
//        return 0;
//    }
}
