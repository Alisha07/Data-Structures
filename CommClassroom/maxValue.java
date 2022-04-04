import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }

            }
            System.out.println(max);
        }

    }
}
