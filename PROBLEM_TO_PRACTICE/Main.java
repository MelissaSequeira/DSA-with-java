package PROBLEM_TO_PRACTICE;
//Even Odd
import java.util.Scanner;
public class Main{
    public static void main(String ars[]){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        if(N%2==0){
            System.out.println("Even!");
        }
        else{
            System.out.println("odd!");
        }
    }
}