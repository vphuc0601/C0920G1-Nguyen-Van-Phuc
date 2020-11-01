package introduction_java.thuc_hanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        int year;
        System.out.println("Nhap vao nam can kiem tra");
        Scanner scanner=new Scanner(System.in);
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
