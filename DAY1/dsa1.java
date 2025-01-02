package DAY1;
// import java.util.*;
// import java.util.Arrays;

// class Solution {
//     int n;
//     Solution(int n){
//         this.n=n;
//     }
//     ArrayList<Integer> list= new ArrayList<>();
//     public int removeElement(int[] nums, int val) {
//         ArrayList<Integer> list1= new ArrayList<>();
      
//         for(int i=0;i<n;i++){
//             if(nums[i]!=val){
//                 list1.add(nums[i]);
//             }
//         }
        
//         Integer[] arr = new Integer[list1.size()];
//         arr = list.toArray(arr);
//         return arr.length;
//     }
// }   
// public class dsa1 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the lenght of array:");
//         int n=sc.nextInt();
//         int[] nums= new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println("Array is "+nums[i]);;
//         }
//         System.out.println("enter the value to be removed:");
//         int val=sc.nextInt();
//         Solution s=new Solution(n);
//         int k =s.removeElement(nums, val);
//         for(int i=0; i<k;i++){
//             System.out.print(nums[i]);
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    int n;

    Solution(int n) {
        this.n = n;
    }

    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list1 = new ArrayList<>();

        // Add all elements from the array to the ArrayList
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {  // Add only if the element is not equal to 'val'
                list1.add(nums[i]);
            }
        }

        // Convert ArrayList back to the array if needed
        for (int i = 0; i < list1.size(); i++) {
            nums[i] = list1.get(i); // Copy back the remaining elements to the original array
        }

        // Return the new size of the array (after removing 'val')
        return list1.size();
    }
}

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the length of the array
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Display the input array
        System.out.println("Array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + " ");
        }

        // Input the value to be removed
        System.out.println("Enter the value to be removed:");
        int val = sc.nextInt();

        // Call the removeElement function
        Solution s = new Solution(n);
        int newLength = s.removeElement(nums, val);

        // Display the updated array
        System.out.println("Array after removing " + val + ":");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        // Display the new length of the array
        System.out.println("\nNew length of the array: " + newLength);
    }
}
