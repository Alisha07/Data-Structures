import java.util.*;

public class revArray {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t != 0) {
                int n = s.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }

                t--;

                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}