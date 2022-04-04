public class runningSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(runningSum1(nums));
    }

    public static int[] runningSum1(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = sum + nums[i];
            sum = ans[i];
        }
        return ans;
    }
}
