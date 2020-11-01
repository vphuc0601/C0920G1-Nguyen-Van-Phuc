package introduction_java.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        double weight, height, BMI;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your weight:");
        weight=scanner.nextDouble();
        System.out.println("Enter your height:");
        height=scanner.nextDouble();
        BMI=weight / Math.pow(height, 2);System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", BMI, "Obese");

    }
}
