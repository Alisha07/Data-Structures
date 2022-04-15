import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // run the steps n-1 times
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            // for each step, max item will come at last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swapped for a particular value of i, it means the array is
            // sorted
            if (swapped == false) {
                break;
            }
        }
    }
}
