package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CaculatorRepository;
import service.CaculatorService;
@Service
public class CaculatorServiceImpl implements CaculatorService {

   @Autowired
   private CaculatorRepository caculatorRepository;
    @Override
    public void addition(double number1, double number2) {
     caculatorRepository.addition(number1, number2);

    }

    @Override
    public void subtraction(double number1, double number2) {
     caculatorRepository.subtraction(number1, number2);
    }

    @Override
    public void multiplication(double number1, double number2) {
    caculatorRepository.multiplication(number1, number2);
    }

    @Override
    public void division(double number1, double number2) {
    caculatorRepository.division(number1, number2);
    }
}
