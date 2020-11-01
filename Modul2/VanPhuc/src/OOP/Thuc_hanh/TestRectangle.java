package OOP.Thuc_hanh;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the width:");
        double width=scanner.nextDouble();
        System.out.println("Please enter the height:");
        double height=scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }

}
