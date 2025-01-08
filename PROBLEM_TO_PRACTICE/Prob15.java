package PROBLEM_TO_PRACTICE;
import java.util.*;
public class Prob15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str1= sc.next();
        String rstr="";
        int N=str1.length();
        StringBuilder sb= new StringBuilder(str1);
        sb.reverse();
        String str2 =sb.toString();
        System.out.println(rstr);
            if(str1==str2){
System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome"); 
            }
    }
}
