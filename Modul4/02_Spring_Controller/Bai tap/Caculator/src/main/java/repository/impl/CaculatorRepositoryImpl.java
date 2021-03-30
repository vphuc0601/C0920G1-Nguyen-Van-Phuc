package repository.impl;

import org.springframework.stereotype.Repository;
import repository.CaculatorRepository;
@Repository
public class CaculatorRepositoryImpl  implements CaculatorRepository {
    @Override
    public void addition(double number1, double number2) {
        addition(number1, number2);
    }

    @Override
    public void subtraction(double number1, double number2) {
        subtraction(number1,number2);
    }

    @Override
    public void multiplication(double number1, double number2) {
        multiplication(number1, number2);
    }

    @Override
    public void division(double number1, double number2) {
        division(number1, number2);
    }
}
