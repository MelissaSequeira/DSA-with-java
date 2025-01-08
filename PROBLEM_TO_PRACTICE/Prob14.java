package PROBLEM_TO_PRACTICE;
import java.util.*;
public class Prob14 {
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            System.out.print("Number of ele in arr: ");
                            int N= sc.nextInt();
                            int[] arr = new int[N];
                            int[] rarr = new int[N];
                            for(int i=0; i<N ;i++){
                                arr[i] = sc.nextInt();
                                }
                            int j=0;
                            for(int i=N-1; i>=0 ;i--){
                                rarr[j]=arr[i];
                                j++;
                                    }
                                    for(int i=0; i<rarr.length;i++){
                                        System.out.print(rarr[i]);
                                        System.out.print(" ");
                                    }
                        }
                    }