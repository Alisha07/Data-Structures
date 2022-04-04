public class EvenDigitsCount {
    public static void main(String[] args) {
        int[] nums = { 1, 2432, 738, 7827 };
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                digits++;
            }
            if (digits % 2 == 0)
                evens++;
        }
        return evens;
    }
}
