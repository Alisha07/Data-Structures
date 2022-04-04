import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int s1 = 0;
            int s2 = 1;
            int s3;
            System.out.print(s1 + " " + s2);
            for (int i = 2; i <= n; i++) {
                s3 = s1 + s2;
                System.out.print(" " + s3);
                s1 = s2;
                s2 = s3;
            }
        }
    }
}
