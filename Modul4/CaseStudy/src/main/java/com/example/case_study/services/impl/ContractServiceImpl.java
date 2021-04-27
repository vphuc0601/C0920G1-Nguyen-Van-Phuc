package com.example.case_study.services.impl;

import com.example.case_study.entities.Contract;
import com.example.case_study.entities.RentType;
import com.example.case_study.repositories.ContractRepository;
import com.example.case_study.repositories.RentTypeRepository;
import com.example.case_study.services.ContractService;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.util.List;
import java.util.Optional;

//import java.time.LocalDate;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private RentTypeRepository rentTypeRepository;
    @Override
    public Page<Contract> search(String keyword, Pageable pageable) {
        return contractRepository.search(keyword,pageable);
    }

    @Override
    public Contract findById(Long id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contract.setContractTotalMoney(getTotalMoney(contract));
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

    @Override
    public double getTotalMoney(Contract contract) {
        double contractTotalMoney=0;
        List<RentType> rentTypeList=rentTypeRepository.findAll();
        LocalDate starDay= LocalDate.parse(contract.getContractStartDate().toString());
        LocalDate endDay=LocalDate.parse(contract.getContractEndDate().toString());
        int days= Days.daysBetween(starDay,endDay).getDays();

        if(days<=31){
            contractTotalMoney+=days*rentTypeList.get(1).getCost();
            System.out.println(contractTotalMoney);
        }else {
            if(days>31 && days<365){
                contractTotalMoney+=days*rentTypeList.get(2).getCost();
            }else {
                if(days>365){
                    contractTotalMoney+=days*rentTypeList.get(3).getCost();
                }
                else {
                    contractTotalMoney+=days*rentTypeList.get(4).getCost();
                }
            }
        }
        return contractTotalMoney;
    }
}
