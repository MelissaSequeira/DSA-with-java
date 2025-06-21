import java.util.Scanner;

public class ArrDay1 {

    public static int largestElement(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= max) {
                max = nums[i];
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
        int ans = largestElement(nums);
        System.out.println(ans);
    }
}