import java.util.Scanner;

public class Arr3Day1 {

    public static Boolean isSorted(int[] nums) {
        Boolean ans = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        Boolean ans = isSorted(nums);
        System.out.println(ans);
    }
}
