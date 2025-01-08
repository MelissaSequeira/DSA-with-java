package PROBLEM_TO_PRACTICE;
/*Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty. 

Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0. */

import java.util.*;
public class Prob18{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        String A =sc.next();
        StringBuilder sb= new StringBuilder(A);
        int countp=0;
        int counta=0;
        int countm=0;
        for(int i=0; i<A.length();i++){
            if(sb.charAt(i)=='p'){
                countp++;
            }
            if(sb.charAt(i)=='a'){
                counta++;
            }
            if(sb.charAt(i)=='m'){
                countm++;
            }
        }
        // int op;
        // while(sb.length() > 0){
        // if(countm>=countp+counta){
            // switch(op){
            //     case 1:
            //     {
            //         for(int i=0; i<sb.length();i++){
            //             if(sb.charAt(i)=='p'){
            //                 sb.delete(i,'p');
            //             }
            //             if(sb.charAt(i)=='m'){
            //                 sb.delete(i,'m');
            //             }
            //         }
            //     }
            //     break;
            //     case 2:
            //     {
            //         for(int i=0; i<sb.length();i++){
            //             if(sb.charAt(i)=='a'){
            //                 sb.delete(i,'a');
            //             }
            //             if(sb.charAt(i)=='m'){
            //                 sb.delete(i,'m');
            //             }
            //         }
            //     }
            //     break;
            // }
            if (countm >= countp + counta) {
            System.out.println(1);  // It's possible to empty the string
        } else {
            System.out.println(0);  // Not enough 'm's to remove all 'p' and 'a'
        }
        // }
        // }
    }
}
