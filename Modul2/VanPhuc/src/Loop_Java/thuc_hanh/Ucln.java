package Loop_Java.thuc_hanh;

import java.util.Scanner;

public class Ucln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = input.nextInt();
        System.out.println("Enter number b: ");
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
