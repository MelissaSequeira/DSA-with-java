import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String snew = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = snew.length() - 1;
        while (l <= r) {
            if (snew.charAt(l) == snew.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Boolean ans = isPalindrome(s);
        System.out.print(ans);
    }
}
