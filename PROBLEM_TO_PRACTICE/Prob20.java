package PROBLEM_TO_PRACTICE;
//Factorial of number:Recursion
import java.util.*;
public class Prob20 {
    static int Fact(int N){
        if(N==0 || N==1)
            return 1;
        else{
            return N*Fact(N-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter number :");
        int N= sc.nextInt();
        int res=Fact(N);
        System.err.println("Factorial of "+N+" is "+res);

    }
}
