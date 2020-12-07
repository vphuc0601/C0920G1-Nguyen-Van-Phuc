package introduction_java.bai_tap;

import java.util.Scanner;

public class tienTe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter USD:");
        double usd= input.nextDouble();
        double vnd;
        double rate=23000;
        vnd= usd*rate;
        System.out.println("Translate to VND:"+vnd);
    }
}
