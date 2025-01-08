package PROBLEM_TO_PRACTICE;
//Sum of postive numbers...stop when -ve
import java.util.Scanner;
public class Prob7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of numbers:");
        int N=sc.nextInt();
        int[] arr =new int[N]; 
        for(int i=0;i<N;i++){
            int current=sc.nextInt();
            arr[i]=current;
        }
        int sum=0;
        for(int i=0;i<N;i++){
            while(arr[i]>=0){
                sum=sum +arr[i];
            }
        }
    System.out.println(sum);
    }
}
