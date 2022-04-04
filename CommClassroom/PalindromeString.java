import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            str = str.toLowerCase();
            int i = 0;
            int j = str.length() - 1;
            boolean isPalindrome = true;
            for (i = 0; i <= j; i++) {
                if (str.charAt(i) != str.charAt(j)) {
                    System.out.println("Not Palindrome");
                    isPalindrome = false;
                    break;
                }

            }
            if (isPalindrome) {
                System.out.println("Palindrome");
            }

        }

    }
}
