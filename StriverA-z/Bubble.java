import java.util.Scanner;

class bubble {
    public static int[] bub(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            int sd = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sd = 1;
                } else {
                    sd = 0;
                }
            }
            if (sd == 0) {
                break;
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = bub(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}