package CaseStudy.Models;

import CaseStudy.Controllers.ReadWritter;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Cabinet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = ReadWritter.readFileEmployee("src/CaseStudy/Data/Employee.csv");
        Stack<Employee> employeeStack = new Stack<>();
        for (Employee emp : employeeList) {
            employeeStack.push(emp);

        }
        System.out.println("Enter employee you want search:");
        String choice = sc.nextLine();

        for (Employee emp : employeeStack) {
            if (choice.equals(emp.getNameEmployee())) {
                System.out.println(emp);
            } else {
                System.out.println("Employee invalid");
            }
            break;
        }
    }
}