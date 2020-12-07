package Exception.bai_tap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhap vao cac canh cua hinh tam giac: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            Triang triang = new Triang(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}


