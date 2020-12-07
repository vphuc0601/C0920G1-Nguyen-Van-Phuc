package Cleancode_Refactoring.thuc_hanh;

public class Caculator {
    public static class Calculator {

        public static int calculate(int a, int b, char o) {
            int firstOperand = a;
            int secondOperand  = b;
            char operator  = o;
            switch (operator ) {
                case '+':
                    return firstOperand + secondOperand ;
                case '-':
                    return firstOperand - secondOperand ;
                case '*':
                    return firstOperand * secondOperand ;
                case '/':
                    if (secondOperand  != 0)
                        return firstOperand / secondOperand ;

                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
            }
        }
    }
}
