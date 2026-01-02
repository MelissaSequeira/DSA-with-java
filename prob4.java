import java.util.*;

abstract class paitent {
    abstract void paitype(int days, int cost);
}

class general extends paitent {
    int roomcost = 500;

    void paitype(int days, int cost) {
        System.out.println("General ward bill amounted to: " + ((days * cost) + (roomcost * days)));
    }
}

class icu extends paitent {
    int roomcost = 1500;
    int foodcost = 300;

    void paitype(int days, int cost) {
        System.out.println("icu bill amounted to : " + ((days * cost) + (roomcost * days) + (foodcost * days)));
    }
}

class insurance extends paitent {
    void paitype(int days, int cost) {
        System.out.println("Insurance will cover the bill of : " + (days * cost * 0.5));
    }
}

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        paitent p1 = new general();
        paitent p2 = new icu();
        paitent p3 = new insurance();
        System.out.println("1. Enter 1 for General ward paitent");
        System.out.println("2. Enter 2 for ICU paitent");
        System.out.println("3. Enter 3 for Insurance paitent");
        int choices = sc.nextInt();
        switch (choices) {
            case 1:
                System.out.println("Enter number of days stayed:");
                int d1 = sc.nextInt();
                System.out.println("Enter daily treatment cost:");
                int c1 = sc.nextInt();
                p1.paitype(d1, c1);
                break;
            case 2:
                System.out.println("Enter number of days stayed:");
                int d2 = sc.nextInt();
                System.out.println("Enter daily treatment cost:");
                int c2 = sc.nextInt();
                p2.paitype(d2, c2);
                break;
            case 3:
                System.out.println("Enter number of days stayed:");
                int d3 = sc.nextInt();
                System.out.println("Enter daily treatment cost:");
                int c3 = sc.nextInt();
                p3.paitype(d3, c3);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
