import java.util.*;
import java.lang.Math;
class Solution {
    public int[] plusOne(int[] digits) {
        // int k = digits.length-1;
        // int sum=0;
        // for(int i=0;i<digits.length;i++)
        // {
        //     digits[i]=digits[i]*((int)Math.pow(10,k));
        //     sum=sum+digits[i];
        //     k--;
        // }
        // sum++;
        // String s=String.valueOf(sum);
        // int len=s.length();
        // int m=sum;
        // int[] arr =new int[len];
        // for(int i=len-1;i>=0;i--){
        //     arr[i]=m %10;
        //     m=m/10;
        // }
        int c=0;
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                c--;
                break;
            }else{
                digits[i]=0;
                c=1;
            }
            
        }
        if(c==1){
            int[] arr =new int[digits.length+1];
            arr[0]=1;
            for(int i=1;i<digits.length+1;i++){
                arr[i]=0;
            }
            return arr;
        }
        return digits;

    }
}

public class dsa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the length of the array
        int[] digits = new int[n];
        
        // Reading the digits input
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        System.out.print("original array:[");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] );
            if(i<digits.length-1){
                System.out.print(',');
            }
        }
        Solution s = new Solution();
        int[] newdigits = s.plusOne(digits);  // Get the updated array
        
        // Print the resulting digits
        
        System.out.println("]");
        System.out.print("Plus one array:[");
        for (int i = 0; i < newdigits.length; i++) {
            System.out.print(newdigits[i] );
            if(i<newdigits.length-1){
                System.out.print(',');
            }
        }
        System.out.println("]");
    }
}
