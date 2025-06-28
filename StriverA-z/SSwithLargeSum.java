import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SSwithLargeSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        int[] cnums = Arrays.copyOf(nums, nums.length);

        for(int i=nums.length-1;i>=0;i--){
            int swapd=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swapd=1;
                }
                
            }if(swapd==0){
                    break;
                }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        int m=0;
        while(k!=0){
            arr.add(nums[m]);
            m++;
            k--;
        }
        // Integer[] array= new Integer[arr.size()];
        // array=arr.toArray();
        int l=0;
        int i=0;
        int n=arr.size();
        int[] arr2= new int[arr.size()];
       while(l<cnums.length && i<n){
        if(arr.contains(cnums[l])){
            arr2[i]=cnums[l];
            arr.remove((Integer) cnums[l]);
           i++;
        }l++;
       }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = maxSubsequence(nums, k);
        System.out.print("Answer:" + '[');
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.print("]");
    }
}
