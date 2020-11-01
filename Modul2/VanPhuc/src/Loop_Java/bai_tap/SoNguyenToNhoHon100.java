package Loop_Java.bai_tap;

public class SoNguyenToNhoHon100 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        while (num < 100){
            if (isPrime(num))   {
                System.out.println(num);
            }
            num++;
        }
    }
}
