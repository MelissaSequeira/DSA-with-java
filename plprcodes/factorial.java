package plprcodes;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factres = fact(n);
        System.out.println(factres);

    }
}
