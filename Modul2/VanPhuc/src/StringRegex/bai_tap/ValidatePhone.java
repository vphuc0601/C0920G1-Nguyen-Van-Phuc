package StringRegex.bai_tap;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone:");
        String phone=sc.nextLine();
        System.out.println(phone.matches("(84|0)[0-9]{9}"));
    }
}
