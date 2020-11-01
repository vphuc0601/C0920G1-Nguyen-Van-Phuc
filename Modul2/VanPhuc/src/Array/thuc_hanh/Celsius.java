package Array.thuc_hanh;

import java.util.Scanner;

public class Celsius {
    public static double celsiusToFahrenheit(double celsius) {

        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;


    }
    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter celsius:");
                    Scanner scanner=new Scanner(System.in);
                    double celsius =scanner.nextDouble();
                    System.out.println("Result:  "+ celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter fahrenheit: ");
                    Scanner scanner1 = new Scanner(System.in);
                    double fahrenheit = scanner1.nextDouble();
                    System.out.println("Result:  "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}