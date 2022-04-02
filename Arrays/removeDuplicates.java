public class removeDuplicates {
    static int removeDuplicates1(int array[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j] = array[i];
                j++;
            }
        }
        array[j] = array[n - 1];
        j++;
        return j;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int n = array.length;

        n = removeDuplicates1(array, n);

        // for (int i = 0; i < n; i++)
        // System.out.print(array[i] + " ");
        System.out.println(n);
    }
}