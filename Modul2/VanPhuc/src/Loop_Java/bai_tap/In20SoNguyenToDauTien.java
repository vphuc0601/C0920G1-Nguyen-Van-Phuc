package Loop_Java.bai_tap;

import java.util.Scanner;

public class In20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac so luong cac so can hien thi: ");
        numbers = scanner.nextInt();
        while (count < numbers){
            int dem = 0;
            for (int i = 1 ; i <= N ;i++){

                if (N % i ==0){
                    dem++;
                }
            }if (dem==2){
                System.out.println(N);
                count++;
            }
            N++;
        }

    }
}
