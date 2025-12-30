class foodie {
    // void order(String type, String item, int qty, int amt) {
    // amt = amt * qty;
    // System.out.println("Order placed: " + type + " , Item: " + item + " ,
    // Quantity: " + qty + " , Amount: " + amt);
    // }

    // void order(String type, String item, int qty, int amt, int extraamt) {
    // amt = amt * qty;
    // amt = amt + extraamt;
    // System.out.println("Order placed: " + type + " , Item: " + item + " ,
    // Quantity: " + qty + " , Amount: " + amt);
    // }

    // void order(String type, String item, int qty, int amt, double discount) {
    // amt = amt * qty;
    // double finalamt = amt - discount * amt;
    // System.out.println(
    // "Order placed: " + type + " , Item: " + item + " , Quantity: " + qty + " ,
    // Amount: " + finalamt);
    // }

    void order() {
        System.out.println("Order placed using no parameters");
    }
}

class dinein extends foodie {
    int amt;
    int qty;
    String item;

    dinein(int amt, int qty, String item) {
        this.amt = amt;
        this.qty = qty;
        this.item = item;
    }

    void order() {
        System.out.println("Order type: Dine in, Item: " + item + ", quatity: " + qty + ", Amount: " + amt * qty);
    }

}

class Takeaway extends foodie {
    int amt;
    int qty;
    String item;
    double discount;

    Takeaway(int amt, int qty, String item, double discount) {
        this.amt = amt;
        this.qty = qty;
        this.item = item;
        this.discount = discount;
    }

    void order() {
        System.out.println("Order type: Takeaway, Item: " + item + ", quatity: " + qty + ", Amount: "
                + amt * qty * (1 - discount));
    }

}

class Delivery extends foodie {
    int amt;
    int qty;
    String item;
    int ext;

    Delivery(int amt, int qty, String item, int ext) {
        this.amt = amt;
        this.qty = qty;
        this.item = item;
        this.ext = ext;
    }

    void order() {
        System.out.println(
                "Order type: Delivery, Item: " + item + ", quatity: " + qty + ", Amount: " + (amt * qty + ext));
    }

}

public class food {
    public static void main(String[] args) {
        foodie f1 = new dinein(110, 2, "CHicken Chilly");
        f1.order();
        foodie f2 = new Takeaway(120, 3, "Fried Rice", 0.1);
        f2.order();
        foodie f3 = new Delivery(130, 4, "Noodles", 50);
        f3.order();
    }
}