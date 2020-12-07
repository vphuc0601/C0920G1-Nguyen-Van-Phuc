package introduction_java.bai_tap;

import java.util.Scanner;

public class numbers_to_letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number need read: ");
        int numbers = scanner.nextInt();
        if (numbers < 0) {
            System.out.println("NG");
        }
        if (numbers < 20) {
            switch (numbers) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                case 10 -> System.out.println("Ten");
                case 11 -> System.out.println("Eleven");
                case 12 -> System.out.println("Twelve");
                case 13 -> System.out.println("Thirteen");
                case 14 -> System.out.println("Fourteen");
                case 15 -> System.out.println("Fifteen");
                case 16 -> System.out.println("Sixteen");
                case 17 -> System.out.println("Seventeen");
                case 18 -> System.out.println("Eighteen");
                case 19 -> System.out.println("Nineteen");
            }
        } else if (numbers < 100) {
            int ch = numbers / 10;
            int dv = numbers % 10;
            switch (ch) {
                case 2 -> System.out.print("twenty");
                case 3 -> System.out.print("Thirty");
                case 4 -> System.out.print("Forty");
                case 5 -> System.out.print("Fifty");
                case 6 -> System.out.print("Sixty");
                case 7 -> System.out.print("Seventy");
                case 8 -> System.out.print("Eighty");
                case 9 -> System.out.print("Ninety");
            }
            switch (dv) {
                case 0 -> System.out.println(" ");
                case 1 -> System.out.println("-one");
                case 2 -> System.out.println("-two");
                case 3 -> System.out.println("-three");
                case 4 -> System.out.println("-four");
                case 5 -> System.out.println("-five");
                case 6 -> System.out.println("-six");
                case 7 -> System.out.println("-seven");
                case 8 -> System.out.println("-eight");
                case 9 -> System.out.println("-nine");
            }
        } else if (numbers < 1000) {
            int tr = numbers / 100;
            int ch = (numbers % 100) / 10;
            int dv = numbers % 10;
            switch (tr) {
                case 1 -> System.out.print("One hundred and ");
                case 2 -> System.out.print("Two hundred and ");
                case 3 -> System.out.print("Three hundred and ");
                case 4 -> System.out.print("Four hundred and ");
                case 5 -> System.out.print("Five hundred and ");
                case 6 -> System.out.print("Six hundred and ");
                case 7 -> System.out.print("Seven hundred and ");
                case 8 -> System.out.print("Eight hundred and ");
                case 9 -> System.out.print("Nine hundred and ");
            }
            switch (ch) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    if (dv == 0) {
                        System.out.print("ten");
                        break;
                    } else if (dv == 1) {
                        System.out.print("eleven");
                        break;
                    } else if (dv == 2) {
                        System.out.print("twevle");
                        break;
                    } else if (dv == 3) {
                        System.out.print("thirteen");
                        break;
                    } else if (dv == 4) {
                        System.out.print("fourteen");
                        break;
                    } else if (dv == 5) {
                        System.out.print("fifteen");
                        break;
                    } else if (dv == 6) {
                        System.out.print("sixteen");
                        break;
                    } else if (dv == 7) {
                        System.out.print("seventeen");
                        break;
                    } else if (dv == 8) {
                        System.out.print("eighteen");
                        break;
                    } else {
                        System.out.print("nineteen");
                        break;
                    }
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            if (ch != 1) {
                switch (dv) {
                    case 0 -> System.out.println(" ");
                    case 1 -> System.out.println("-one");
                    case 2 -> System.out.println("-two");
                    case 3 -> System.out.println("-three");
                    case 4 -> System.out.println("-four");
                    case 5 -> System.out.println("-five");
                    case 6 -> System.out.println("-six");
                    case 7 -> System.out.println("-seven");
                    case 8 -> System.out.println("-eight");
                    case 9 -> System.out.println("-nine");
                }
            }
        } else {
            System.out.println(" ");
        }
    }
}