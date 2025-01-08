package PROBLEM_TO_PRACTICE;
//Count the number of digits in given number
import java.util.Scanner;
public class Prob6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int m=N;
        int j=0;
        //  int[] arr= new arr[];
        while(m!=0){
            m=m/10;
            j++;
        }
        System.out.println("Number of digits in "+N+" is "+j);
    }
}
