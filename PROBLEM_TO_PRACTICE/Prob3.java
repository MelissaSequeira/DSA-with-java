package PROBLEM_TO_PRACTICE;
//Add 2 numbers and divide it with 3rd and get remainder
import java.lang.*;
import java.util.*;

public class Prob3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int nAdd= n1+n2;
        int nDivide= nAdd%n3;
        System.out.println(nDivide);
        }
}