package DAY1;
import java.util.*;
    class Solution {
        public void moveZeroes(int[] nums) {
            int numZeros = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    numZeros++;
                    int temp = nums[i];
    
                    // Shift all elements to the left
                    for (int j = i; j <= nums.length - 2; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = temp;
                    
                    // Move the index back to check the swapped value
                    i--;
                }
    
                // Break the loop if all zeroes have been moved
                if (numZeros == countZeros(nums)) {
                    break;
                }
            }
    
            // Print the result
            System.out.print('[');
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]);
                if (i < nums.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print(']');
        }
    
        // Helper function to count the remaining zeroes
        private int countZeros(int[] nums) {
            int count = 0;
            for (int num : nums) {
                if (num == 0) {
                    count++;
                }
            }
            return count;
        }
    }    

public class dsa2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array:");
        int n=sc.nextInt();
        int[] nums =new int[n];
        for(int i=0 ;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        s.moveZeroes(nums);
    }
}