package StringRegex.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter class:");
        String name=sc.nextLine();
        System.out.println(name.matches("(A|C|P)[0-9]{4}(G|H|I|K|L|M)"));
    }
}
