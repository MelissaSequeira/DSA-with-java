package PROBLEM_TO_PRACTICE;

import java.lang.*;
import java.util.*;
public class Prob13 {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Number of ele in arr: ");
                        int N= sc.nextInt();
                        int[] arr = new int[N];
                        for(int i=0; i<N ;i++){
                            arr[i] = sc.nextInt();
                        }
                        int max=arr[0];
                        int min=arr[0];
                        for(int i=0;i<N;i++){
                            if(arr[i]>max){
                                max=arr[i];
                            }
                            if(arr[i]<min){
                                min=arr[i];
                            }
                        }
                        System.out.println("Maximum:"+max);
                        System.out.println("Maximum:"+min);
                    }
}