package introduction_java.thuc_hanh;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so USD can doi ");
        double USD = scanner.nextDouble();
        double rate = 23000*USD;
        System.out.println("Gia tri tinh ra VND: "+ rate+"VND");
    }
}
