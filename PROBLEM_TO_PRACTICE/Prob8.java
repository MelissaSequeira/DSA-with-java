package PROBLEM_TO_PRACTICE;
//sum of n numbers
import java.lang.*;
import java.util.*;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int sum=0;
        for (int i=1; i<=N ;i++){
            sum =sum + i;
        
        }
        System.out.println(sum);
    }
} 
