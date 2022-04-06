public class nextGreatest {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'e';
        System.out.println(ceil(letters, target));
    }

    private static char ceil(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        // letters wrap around
        return letters[start % letters.length];

    }
}
