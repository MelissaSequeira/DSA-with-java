import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//O(n)
public class MissingValue {
    public static int missingNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int c = 0;
        while (n != -1) {
            map.put(c, 0);
            c++;
            n--;
        }
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = missingNumber(nums);
        System.out.print(ans + " ");

    }
}
