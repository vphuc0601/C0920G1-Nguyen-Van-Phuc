package SapXep.bai_tap;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter list size");
        int size=scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSortByStep(list);
    }
    public static void insertSortByStep(int[] list){
        int holePosition ;
        int valueToInsert;
        for(int i=1; i<list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;
            while (holePosition > 0 && list[holePosition - 1] > valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition--;
                if (holePosition != i) {
                    list[holePosition] = valueToInsert;
                }
            System.out.println(list[holePosition]);
            }
            System.out.println(list[i]);
        }
    }
}
