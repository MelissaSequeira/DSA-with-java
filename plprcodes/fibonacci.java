package plprcodes;

import java.util.Scanner;

public class fibonacci {
    public static int fibs(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibs(n-1)+fibs(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibres = fibs(n);
        System.out.println(fibres);

    }
}
