class discount {
    void applyDis() {
        System.out.println("Discount applied");
    }
}

class festivDis extends discount {
    int amt;
    double dis;

    festivDis(int amt, double dis) {
        this.amt = amt;
        this.dis = dis;
    }

    void applyDis() {
        System.out.println("Festive Discount applied: " + dis + " ie : " + (amt - (dis * amt)) + " on amount: " + amt);
    }
}

class couponDis extends discount {
    int amt;
    int c;

    couponDis(int amt, int c) {
        this.amt = amt;
        this.c = c;
    }

    void applyDis() {
        System.out.println("Coupon Discount applied: " + c + " ie : " + (amt - c) + " on amount: " + amt);
    }
}

public class disco {
    public static void main(String[] args) {
        discount f = new festivDis(2000, 0.2);
        f.applyDis();
        discount c = new couponDis(3000, 500);
        c.applyDis();
    }
}