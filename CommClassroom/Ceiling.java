public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        System.out.println(ceil(arr, target));
    }

    private static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // binary(arr, target, start, end);
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == arr[mid]) {
                return arr[mid];
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return arr[start];

    }
}
