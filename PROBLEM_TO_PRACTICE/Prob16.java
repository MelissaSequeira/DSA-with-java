package PROBLEM_TO_PRACTICE;
import java.util.*;
public class Prob16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str1= sc.next();
        String rstr="";
        int N=str1.length();
        for(int i=N-1;i>=0;i--)
        {
            rstr=rstr+str1.charAt(i);
            
        }
        System.out.println(rstr);
    }
}