package Exception.thuc_hanh;

import java.util.*;

public class TestException {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Numerator:");
        int numerator = scanner.nextInt();
        System.out.printf("Denominator:");
        int denominator = scanner.nextInt();
        int result = numerator/denominator;
        System.out.printf("\nResult: %d / %d = %d \n",numerator, denominator, result);
    }
}
