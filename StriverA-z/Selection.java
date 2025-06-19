import java.util.Scanner;

class Selection {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }

            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = selectionSort(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}