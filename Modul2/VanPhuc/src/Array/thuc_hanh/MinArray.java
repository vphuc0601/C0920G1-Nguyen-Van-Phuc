package Array.thuc_hanh;

public class MinArray {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 5, 6, 9};
        System.out.println("The smallest element in the array is: " + minValue(arr));
    }
    public static int minValue(int[] array){
        for (int i=0; i<array.length; i++){
            int min=array[0];
            if (min>array[i]){
                min =array[i];
            }else {
                return min;
            }
        }
        return 0;
    }
}

