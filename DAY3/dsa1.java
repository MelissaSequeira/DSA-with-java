import java.util.Scanner;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n;
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
         int temp;
        //  for(int j=0;j<p;j++){
        //     for(int i=0; i<p-1;i++){
        //         if(nums1[i]>nums1[i+1]){
        //         temp=nums1[i];
        //         nums1[i+1]=temp; here i+1 ka value will be vanished if temp will be put
        //         nums1[i]=nums1[i+1];
        //     }
        //     }
        //  }
        for (int j = 0; j < p; j++) {
            for (int i = 0; i < p - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    // Correct swapping logic
                    temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }
        }
         for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
         }
    }
}

public class dsa1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nums1 ka length:");
        int m=sc.nextInt();
        System.out.println("nums2 ka length:");
        int n=sc.nextInt();
        int[] nums1= new int[m+n];
        int[] nums2= new int[n];
        for(int i=0;i<m+n;i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        Solution s=new Solution();
        s.merge(nums1, m, nums2, n);
    }
}