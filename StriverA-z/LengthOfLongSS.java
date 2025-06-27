import java.util.ArrayList;
import java.util.Scanner;

public class LengthOfLongSS {
    public static int moveZeroes(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int l = 0;
        int c = 0;
        int r = l;
        while (l < nums.length) {
            if (sum != k) {
                sum = sum + nums[r];
                c++;
                r++;
            } else {
                arr.add(c);
                sum = 0;
                l++;
                r = l;
            }
        }
        int max = 0;
        for (int n : arr) {
            if (max < n) {
                max = n;

            }
        }
        return max;
    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = moveZeroes(nums, k);
        System.out.print("Answer:" + ans);
    }

}
