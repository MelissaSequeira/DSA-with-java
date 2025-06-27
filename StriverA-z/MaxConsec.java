import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsec {
    public static int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            } else {
                arr.add(c);
                c = 0;
                continue;
            }
        }
        arr.add(c);
        int max = 0;
        for (int n : arr) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = findMaxConsecutiveOnes(nums);
        System.out.print("Answer is :" + ans + " ");

    }
}