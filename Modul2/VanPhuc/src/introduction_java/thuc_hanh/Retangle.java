package introduction_java.thuc_hanh;

import java.util.Scanner;

public class Retangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the width:");
        width = input.nextFloat();
        System.out.println("Please enter the height:");
        height= input.nextFloat();
        float area= width*height;
        System.out.println("Area of Retangle: "+ area);
    }
}
