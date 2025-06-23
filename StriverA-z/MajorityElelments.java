 import java.util.HashMap;
//O(n2)
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n = nums.length / 2;
import java.util.Scanner;

//         for (int k : nums) {O(n)
//             // Only count if not already counted
//             if (!map.containsKey(k)) {
//                 map.put(k, count(k, nums));  // ✅ Use your method here
//             }
//         }

//         for (int key : map.keySet()) {O(n)
//             if (map.get(key) > n) {
//                 return key;
//             }
//         }

//         return -1;  // Should never happen in this problem
//     }

//     public int count(int k, int[] nums) {
//         int c = 0;
//         for (int n : nums) {
//             if (k == n) {
//                 c++;
//             }
//         }
//         return c;
//     }
// }

//O(n)
public class MajorityElelments {
    public static int majorityElement(int[] nums) {
      HashMap<Integer, Integer> map=new HashMap<>();
      int n=nums.length/2;
      for(int num:nums){
        map.put(num, map.getOrDefault(num, 0) + 1);//because of thisO(n)
        //getOrDefault(if num present )map.getOrDefault(num, 0)
        //→ This means:

        //“If num is already in the map, get its value (current count). Otherwise, use 0.”
        //map.getOrDefault(num, 0) + 1
        //→ This means:      
        //→ Increments the count for num by 1.
      }  int i=0;
      for(int j:map.keySet()){
        if(map.get(j)>n){
            i=j; 
        }
      }
      return i;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = majorityElement(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans+ " ");
        }

    }   
}
