package OOP.bai_tap;

import java.util.Scanner;

public class TestPtBac2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a: ");
         double a = scanner.nextDouble();
        System.out.println("Please enter b:");
        double b = scanner.nextDouble();
        System.out.println("Please enter c:");
        double c = scanner.nextDouble();
        PtBac2 ptBac2=new PtBac2(a,b,c);
        if (a==0){
            System.out.println("This is not QuadraticEquation:");
        }
        else {
            if (ptBac2.getDiscriminant()<0){
                System.out.println("The equation has no roots:");
            }else {
                System.out.println("The equation have 2 root:"+ "Root1=" + ptBac2.getRoot1()
                        + "Root2=" + ptBac2.getRoot2()
                        );
            }
        }


    }
}
