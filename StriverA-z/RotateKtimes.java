import java.util.Scanner;

public class RotateKtimes {
    public static int[] rotate(int[] nums, int k) {
        if (nums.length != 1) {
            while (k != 0) {
                int temp = nums[nums.length - 1];
                for (int i = nums.length - 2; i >= 0; i--) {
                    nums[i + 1] = nums[i];
                }
                nums[0] = temp;
                k--;
            }
            return nums;
        } else {
            return nums;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt(); // ✅ Correct

        }
        int[] ans = rotate(nums, k);
        System.out.print("Answer:" + '[');
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");

    }

}
