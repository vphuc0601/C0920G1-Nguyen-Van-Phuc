package Array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 5, 4, 5, 14};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang ban dau :" + Arrays.toString(arr));
        System.out.println("Nhap so can xoa:");
        int j = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j && i != arr.length - 1) {
                count++;
                for (int k = i; k < arr.length - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                i--;
            } else if (arr[i] == j && i == arr.length - 1) {
                count++;
            }
        }
        System.out.print("Mang sau khi xoa :");
        int[] arr1 = new int[arr.length - count];
        for (int i = 0; i < arr.length - count; i++) {
                arr1[i] = arr[i];
        }System.out.println(Arrays.toString(arr1));
    }
}

