import java.util.Scanner;

public class Reverse {
    public static char[] reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l != r && l < r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] nums = new char[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.next().charAt(0); // ✅ Correct

        }
        char[] ans = reverseString(nums);
        System.out.print("Answer:" + '[');
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");

    }
}
