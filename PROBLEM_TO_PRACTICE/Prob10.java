package PROBLEM_TO_PRACTICE;
import java.lang.*;
import java.util.*;

public class Prob10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int N= sc.nextInt();
            int[] arr =new int[N];
            for(int i=0; i<5; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Element to be found:");
            int x=sc.nextInt();
            int ans=-1;
            for (int i=0;i<N;i++){
                if(arr[i]==x){
                    ans=i;
                    
                }
            }
            System.out.println(ans);

        }
    }