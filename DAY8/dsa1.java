package DAY8;
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr1= new ArrayList<>();
        List<Integer> arr2= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr1.add(0);
        }
        int n;
        for(int i=0;i<nums.length;i++){
            n=nums[i];
            arr1.set(n-1, arr1.get(i) - 1);
        }
        for(int i=0;i<nums.length;i++){
           if(arr1.get(i)==0){
            arr2.add(i+1);
           }
        }return arr2;

    }
}

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("entered array:");
        System.out.print("[");
        for(int i=0; i<n;i++){
            System.out.print(nums[i]);
            if(i<n-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
        Solution s=new Solution();
        List<Integer> arr= new ArrayList<>();
        arr=s.findDisappearedNumbers(nums);
        System.out.println("missing numbers:");
        System.out.print("[");
        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i));
            if(i<arr.size()-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
