import java.util.Scanner;

public class Movezeros {
    public static int[] moveZeroes(int[] nums) {
        int l = 0;
        int r = l + 1;
        while (r < nums.length) {
            if (nums[l] != 0) {
                l++;
            }
            if (nums[r] != 0 && nums[l] == 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
        return nums;
    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = moveZeroes(nums);
        System.out.print("Answer:" + '[');
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");

    }
}
