public class MinimumPlatforms {
    // Returns minimum number of platforms required
    public static int findPlatform(int arr[], int dep[], int n) {
        int result = 1;
        int platNeeded = 1;
        int i = 1, j = 0;
        for (i = 0; i < n; i++) {
            platNeeded = 1;
            for (j = i + 1; j < n; j++) {
                if ((arr[j] >= arr[i] && arr[j] <= dep[i]) || (arr[i] >= arr[j] && arr[i] <= dep[j]))
                    platNeeded++;
            }
            result = Math.max(result, platNeeded);
        }
        return result;

    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = 6;
        System.out.println(
                "Minimum Number of Platforms Required = "
                        + findPlatform(arr, dep, n));
    }
}
