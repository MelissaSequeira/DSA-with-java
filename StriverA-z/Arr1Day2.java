import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Arr1Day2 {

    public static int[] removeDuplicate(int[] nums) {
        // O(n^2) hai ye
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int n : nums) {
        // arr.add(n);
        // }
        // for (int i = 0; i < arr.size() - 1; i++) {
        // for (int j = i + 1; j < arr.size(); j++) {
        // if (arr.get(i).equals(arr.get(j))) {
        // arr.remove(j);
        // j--; // Important to re-check shifted value
        // }
        // }
        // }
        // int[] newn = new int[arr.size()];
        // for (int i = 0; i < arr.size(); i++) {

        // newn[i] = arr.get(i);

        // }

        // O(n) hai ye
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int[] newn = new int[set.size()];
        int i = 0;
        for (int n : set) {
            newn[i] = n;
            i++;
        }
        return newn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = removeDuplicate(nums);
        System.out.print("Answer:" + '[');
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}