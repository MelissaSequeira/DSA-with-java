package plprcodes;

import java.util.Scanner;

public class lcm {
    public static int lcm(int n1, int n2) {
        int max = (n1 > n2) ? n1 : n2;
        while (true) {
            if (max % n1 == 0 && max % n2 == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = lcm(n1, n2);
        System.out.println("LCM of " + n1 + " and " + n2 + " is " + res);
        System.out.println("gcd:" + (n1 * n2) / res);

    }
}
