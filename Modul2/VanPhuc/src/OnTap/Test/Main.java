package OnTap.Test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("-----MENU-----");
        System.out.println("1.Add");
        System.out.println("2.Edit");
        System.out.println("3.Delete");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice:");
        String choice=scanner.nextLine();
        switch (choice){
            case "1": Controller.addStudent();break;
            case "2": Controller.editStudent();break;
            case "3": Controller.deleteStudent();break;
        }
    }
}
