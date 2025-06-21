
import java.util.ArrayList;
import java.util.Scanner;

public class Arr2Day1 {

    public static int[] secondLargestElement(int[] nums) {
        ArrayList<Integer> numsA = new ArrayList<>();
        for (int n : nums) {
            numsA.add(n);
        }
        int n = numsA.size();
        int max = numsA.get(0);
        int min = max;
        for (int i = 0; i < n; i++) {
            if (numsA.get(i) >= max) {
                max = numsA.get(i);
            }
            if (numsA.get(i) <= min) {
                min = numsA.get(i);
            }
        }
        numsA.remove(Integer.valueOf(max));
        numsA.remove(Integer.valueOf(min)); // Fix: remove the value, not index

        int secmax = numsA.get(0);
        int secmin = secmax;
        for (int i = 0; i < numsA.size(); i++) {
            if (numsA.get(i) >= secmax) {
                secmax = numsA.get(i);
            }
            if (numsA.get(i) <= secmin) {
                secmin = numsA.get(i);
            }
        }
        int[] arr = { secmax, secmin };
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int ans[] = secondLargestElement(nums);
        System.out.println("2nd large:"+ans[0] + " " +"2nd small:"+ ans[1]);
    }
}