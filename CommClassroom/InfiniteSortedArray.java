public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // start with box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;

            // double the box size
            // end = previousEnd + sizeOfBox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);

    }

    public static int BinarySearch(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;

        int mid = low + ((high - low) / 2);
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid]) {
            return BinarySearch(arr, key, low, mid - 1);
        } else {
            return BinarySearch(arr, key, mid + 1, high);
        }
    }
}
