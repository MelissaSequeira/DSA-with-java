import java.util.Scanner;

public class Quick {
    public static int[] quicksort(int[] nums, int l, int h) {
        if (l < h) {
            int p = fun(nums, l, h);
            quicksort(nums, l, p - 1);
            quicksort(nums, p + 1, h);
        }
        return nums;
    }

    public static int fun(int[] nums, int l, int h) {
        int i = l;
        int j = h;
        int piv = nums[l];

        while (i < j) {
            while (nums[i] <= piv && i < h) {
                i++;
            }
            while (nums[j] > piv && j > l) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp1 = nums[l];
        nums[l] = nums[j];
        nums[j] = temp1;
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = quicksort(nums, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
