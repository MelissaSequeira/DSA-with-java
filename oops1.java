
interface PayMeth {
    void pay(double amt);
}

class Card implements PayMeth {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using card");
    }
}

class UPI implements PayMeth {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using UPI");
    }
}

class Net implements PayMeth {
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using Net Banking");
    }
}

class oops1 {
    public static void main(String[] args) {
        PayMeth card = new Card();
        card.pay(8000);
        PayMeth upi = new UPI();
        upi.pay(9000);
        PayMeth net = new Net();
        net.pay(3000);
    }
}