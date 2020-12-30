package OnTap.Test;

import CaseStudy.Controllers.ReadWritter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static List<Student> studentList=new ArrayList<>();
    public static Scanner sc=new Scanner(System.in);
    private static String inputName(){
        System.out.println("Enter name");
        return sc.nextLine();
    }
    private static String inputAge(){
        System.out.println("Enter age");
        return sc.nextLine();
    }
    private static String inputAddress(){
        System.out.println("Enter address");
        return sc.nextLine();
    }
    private static String inputId(){
        System.out.println("Enter id");
        return sc.nextLine();
    }
    public static void addStudent(){
        int count;
        String line ;
        List<Student> studentList=ReadWritter.readFileStudent("src/OnTap/Test/student.csv");
            count= studentList.size()+1;
            Student student = new Student(inputId(), inputName(), inputAge(), inputAddress());
            line = count+"."+student.toString();
            ReadWritter.writeFile("src/OnTap/Test/student.csv",line);
}
    public static void editStudent(){
        List<Student> studentList=ReadWritter.readFileStudent("src/OnTap/Test/student.csv");
        System.out.println(studentList);
        System.out.println("Enter name you want edit:");
        String name=sc.nextLine();
        for (Student student:studentList) {
            if(name.equals(student.getName())){
                Student student1=new Student(inputId(),inputName(),inputAge(),inputAddress());
                student=student1;
                int count= studentList.indexOf(student1)+1;
                String line= count+"."+student;
                ReadWritter.writeFile("src/OnTap/Test/student.csv",line);
//            }else {
//                System.out.println("Name invalid");
            }
        }
    }
    public static void deleteStudent() {
        List<Student> studentList=ReadWritter.readFileStudent("src/OnTap/Test/student.csv");
        for (Student student:studentList) {
            System.out.println(student);
        }
        System.out.println("Enter name you want delete:");
        String name=sc.nextLine();
        studentList.removeIf(student1 -> name.equals(student1.getName()));
        System.out.println(studentList);

    }
}

