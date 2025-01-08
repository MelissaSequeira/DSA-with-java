package PROBLEM_TO_PRACTICE;
import java.lang.*;
import java.util.*;

public class Prob12 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Number of ele in arr1: ");
                    int N1= sc.nextInt();
                    int[] arr1 =new int[N1];
                    System.out.print("elements in arr1: ");
                for(int i=0; i<N1; i++){
                    arr1[i]=sc.nextInt();
                }     
                System.out.print(" Number of ele in aar2:");
                int N2= sc.nextInt();    
                int[] arr2=new int[N2];
                System.out.print("elements in arr2: ");
                for(int i=0; i<N2; i++){
                    arr2[i]=sc.nextInt();
                } 
                int N3=N1+N2;
                int[] arr3= new int[N3];
                int k=0;
                for(int i=0; i<N1 ;i++){
                    for(int j=0; j<N2; j++){
                        if(arr2[j]==arr1[i]){
                            arr3[k]=arr2[j];
                            k++;
                        }
                    }
                }
                System.out.print(" Result :" );
                for(int i=0; i<arr3.length;i++){
                    System.out.print(arr3[i]);
                    System.out.print(" ");
                }
                }
            }