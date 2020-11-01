package Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int[] array = new int[2];
    int[] array1 = new int[3];
    int[] array2 = new int[5];
        for (int i = 0; i < array.length; i++) {
        System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang 1:");
        array[i] = scanner.nextInt();
    }
        for (int i = 0; i < array1.length; i++) {
        System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang 2:");
        array1[i] = scanner.nextInt();
    }
        for (int i = 0; i < array2.length; i++) {
        if (i < array.length) {
            array2[i] = array[i];
        } else {
            array2[i] = array1[i - array.length];
        }
    }
        System.out.println("Mang 1: " + Arrays.toString(array));
        System.out.println("Mang 2: " + Arrays.toString(array1));
        System.out.println("Mang 3: " + Arrays.toString(array2));
}
}

