import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int l = 0;
        int r = l + 1;
        int[] arr = new int[2];
        while (l <= nums.length - 2) {
            if (nums[l] + nums[r] == target) {
                arr[0] = l;
                arr[1] = r;
                break;
            } else if (r == nums.length - 1) {
                if (l == nums.length - 2 && r == nums.length - 1) {
                    break;
                } else {
                    l++;
                    r = l + 1;
                }
            } else {
                r++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = twoSum(nums, t);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}