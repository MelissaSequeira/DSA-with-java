package PROBLEM_TO_PRACTICE;
/*Electricity mein or in any word the first letter kidhar repeat hota hai vaha $ dalo */
import java.util.*;
public class Prob17{
    public static void main(String args[]) {
        // complete the function template
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb =new StringBuilder(s);
        char c1= sb.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c1){
                sb.setCharAt(i,'$');
            }
    
        }
        System.out.println(sb.toString()) ;
    }
    
}
