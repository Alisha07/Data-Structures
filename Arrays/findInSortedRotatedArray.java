public class findInSortedRotatedArray {
    static int findNumber(int array[], int start, int end, int value) {
        int mid = start + ((end - start) / 2);
        if (array[mid] == value) {
            return mid;
        }
        if (array[mid] > value) {
            if (array[start] > value) {
                return findNumber(array, mid + 1, end, value);
            } else {
                return findNumber(array, start, mid - 1, value);
            }
        } else {
            return findNumber(array, mid + 1, end, value);
        }
        // Result Index 7

    }

    public static void main(String args[]) {
        int array[] = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        int n = array.length;
        int value = 1;
        int i = findNumber(array, 0, n - 1, value);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Value not found");
    }
}
