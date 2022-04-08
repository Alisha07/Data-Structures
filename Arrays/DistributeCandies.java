public class DistributeCandies {
    public static void main(String[] args) {
        int ratings[] = { 1, 5, 2, 1 };
        int result = candy(ratings);
        System.out.println(result);
    }

    private static int candy(int[] ratings) {
        int size = ratings.length;
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = 1;
        right[size - 1] = 1;
        int sum = 0;

        for (int i = 1; i < size; i++) {
            if (ratings[i - 1] < ratings[i]) {
                left[i] = left[i - 1] + 1;
            }
        }

        for (int i = size - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        for (int i = 0; i < size; i++) {
            sum += max(left[i], right[i]);
        }

        return sum;
    }

    private static int max(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }
}
