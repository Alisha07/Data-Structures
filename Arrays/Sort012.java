
import java.util.Arrays;

class Main {
    // sort a array containing 0, 1 and 2
    // three-way Partitioning
    public static void Sort012(int[] array, int end) {
        int start = 0, mid = 0;

        while (mid <= end) {
            if (array[mid] == 0) {
                swap(array, start, mid);
                ++start;
                ++mid;
            } else if (array[mid] == 2) {
                swap(array, mid, end);
                --end;
            } else
                ++mid;

        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

/*
 * Try more Inputs
 * case 1:
 * actual = Sort012([0, 1, 2, 0, 1, 2],5)
 * expected = [0, 0, 1, 1, 2, 2]
 * 
 * case2:
 * actual = Sort012([0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1],11)
 * expected = [0,0,0,0,0,1,1,1,1,1,2,2]
 * 
 * case3:
 * actual = Sort012([2,0,1}],3)
 * expected = [0,1,2]
 */
