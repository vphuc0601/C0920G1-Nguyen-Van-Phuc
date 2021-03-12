package model;

public class Caculator {
    public static float caculate(float a, float b, String operator){
        switch (operator){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/":
                if (b!=0){return a/b;}
                else throw new RuntimeException("Mẫu số phải khác 0");
            default:throw new RuntimeException("Please check Operator");
        }
    }
}
