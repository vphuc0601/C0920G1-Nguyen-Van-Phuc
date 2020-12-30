package OnTap.Dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDictionary {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*****DICTIONARY*****");
        System.out.println("1.Add");
        System.out.println("2.Search");
        System.out.println("3.Edit");
        System.out.println("4.Delete");
        System.out.println("Enter your choice");
        String choice=sc.nextLine();
        switch (choice){
            case "1": Controller.addWord();break;
            case "2": Controller.searchWord();break;
            case "3": Controller.editWord();break;
            case "4": Controller.deleteWord();break;
        }
    }
}
