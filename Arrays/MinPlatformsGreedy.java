import java.util.Arrays;

public class MinPlatformsGreedy {
    static int minimumNumberOfPlatform(int arrival[], int departure[], int n) {
        Arrays.sort(departure);
        int i = 0;
        int j = 0;
        int platform = 0;
        int result = 0;
        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                platform++;
                i++;
                if (result < platform) {
                    result = platform;
                }
            } else {
                platform--;
                j++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arrival = { 100, 140, 150, 200, 215, 400 };
        int[] departure = { 110, 300, 220, 230, 315, 600 };
        int n = arrival.length;

        System.out.print("Minimum platforms required is "
                + minimumNumberOfPlatform(arrival, departure, n));
    }

}
