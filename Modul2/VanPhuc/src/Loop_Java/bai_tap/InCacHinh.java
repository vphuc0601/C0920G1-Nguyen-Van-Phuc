package Loop_Java.bai_tap;

import java.util.Scanner;

public class InCacHinh {
    public static void main(String[] args) {
        int choice;
        Scanner input =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle ");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                int width, lenght;
                System.out.println("Nhập chiều rộng: ");
                width= input.nextInt();
                System.out.println("Nhập chiều dài: ");
                lenght= input.nextInt();
                for (int i=0; i<width; i++){
                    for (int j=0; j<lenght; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                for (int i = 5 ; i >=1;i-- ){
                    for (int j = 1 ; j <= i ;j++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
                    }
        }
    }

