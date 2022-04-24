public class CountFrequencies {
    public static void main(String[] args) {
        int[] input = { 2, 3, 3, 2, 5 };
        countfrequenciesEfficient(input);
    }

    public static void countfrequenciesEfficient(int input[]) {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            input[i]--;
        }
        for (int i = 0; i < n; i++) {
            input[input[i] % n] = n + input[input[i] % n];
        }
        for (int i = 0; i < n; i++) {
            if (input[i] / n != 0) {
                System.out.println("Frequency of " + (i + 1) + " " + "= " + input[i] / n);
            }
        }
    }
}
