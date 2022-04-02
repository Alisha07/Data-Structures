public class MinJumps {

    private static int Jump(int[] num) {
        int a = num[0];
        int b = num[0];
        int jump = 1;

        if (num.length == 1) {
            return 0;
        }
        if (a == 0) {
            return -1;
        }
        for (int i = 1; i < num.length; i++) {
            if (i == num.length - 1) {
                return jump;
            }
            a--;
            b--;

            if (num[i] > b) {
                b = num[i];
            }

            if (b == 0 && num[i] == 0) {
                jump = -1;
                return jump;
            }

            if (a == 0) {
                jump++;
                a = b;
            }

        }
        return jump;
    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 1, 0, 4 };

        System.out.println("Minimum number of jumps to reach end is : "
                + Jump(num));
    }
}