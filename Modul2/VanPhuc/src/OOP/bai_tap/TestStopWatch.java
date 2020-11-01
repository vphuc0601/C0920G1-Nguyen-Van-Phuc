package OOP.bai_tap;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        // goi phuong thuc start() cua stopwatch de bam gio bat dau
        stopWatch.start();
        System.out.println("Start time: " + stopWatch.getStartTime());

        // tao array voi 100.000 so voi cac so duoc random la 0 - 100.000
        // moi phan tu se random la [min, max] (Math.random() * (max - 0)) + min)
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        // sap xep chon (selection sort
        selectionSort(array);

        // goi phuong thuc stop() cua stopwatch de bam gio ket thuc
        stopWatch.stop();
        System.out.println("End time: " + stopWatch.getEndTime());

        // in ra thoi gian giua start va end boi phuong thuc getElapsedTime()
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }

    // static: dinh nghia phuong thuoc selection sort o day
    static void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
