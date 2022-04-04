public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum = rowSum + accounts[person][account];

            }
            if (rowSum > ans)
                ans = rowSum;
        }
        return ans;
    }
}
