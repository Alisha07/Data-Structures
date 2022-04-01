class findMaximum {
    static int findMaximum1(int array[], int start, int end) {

        if (start == end) {
            return array[start];
        }
        if (start + 1 == end) {
            return array[start] > array[end] ? array[start] : array[end];
        }

        int mid = start + ((end - start) / 2);

        if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
            return array[mid];
        }

        else if (array[mid] > array[mid - 1] && array[mid] < array[mid + 1]) {
            return findMaximum1(array, mid + 1, end);
        } else {
            return findMaximum1(array, start, mid - 1);

        }
    }

    public static void main(String[] args) {
        int array[] = { 3, 5, 15, 50, 11, 10, 8, 6 };
        int n = array.length;
        System.out.println("The maximum Value " + findMaximum1(array, 0, n - 1));
    }
}
