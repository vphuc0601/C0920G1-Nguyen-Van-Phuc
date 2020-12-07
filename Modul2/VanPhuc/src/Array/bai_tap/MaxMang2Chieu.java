package Array.bai_tap;

import java.util.Scanner;

public class MaxMang2Chieu {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap i:");
        i = input.nextInt();
        System.out.println("Nhap j:");
        j = input.nextInt();
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            int max = array[0][0];
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Nhap phan tu thu" + "(" + i + "," + j + "):");
                array[i][j] = input.nextInt();
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
            System.out.println("Phan tu lon nhat cua mang:" + max);
        }
    }
}
