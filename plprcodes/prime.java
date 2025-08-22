package plprcodes;

import java.util.Scanner;

public class prime {
    public static boolean primeno(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean pres = primeno(n);
        System.out.println(pres);
    }
}
