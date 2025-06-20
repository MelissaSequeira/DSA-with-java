import java.util.ArrayList;
import java.util.Scanner;

class Merge {
    public static int[] mergesort(int[] nums, int l, int h) {
        int m = (l + h) / 2;
        if (l < h) {
            mergesort(nums, l, m);
            mergesort(nums, m + 1, h);
            merge(nums, l, m, h);
        }
        return nums;
    }

    public static int[] merge(int[] nums, int l, int m, int h) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;
        while (i <= m && j <= h) {
            if (nums[i] < nums[j]) {
                temp.add(nums[i]);
                i++;
            } else {
                temp.add(nums[j]);
                j++;
            }
        }
        while (i <= m) {
            temp.add(nums[i]);
            i++;
        }
        while (j <= h) {
            temp.add(nums[j]);
            j++;
        }
        for (int k = l; k <= h; k++) {
            nums[k] = temp.get(k - l);
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
        int[] ans = mergesort(nums, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}