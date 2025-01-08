package PROBLEM_TO_PRACTICE;
//Type of Triangle
import java.lang.*;
import java.util.*;

public class Prob4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(s1==s2 && s2==s3 && s1==s3){
            System.out.println("equilateral");
        }
        else if(s1==s2 || s2==s3 ||s1==s3){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
}
