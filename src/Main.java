public class Main {
    public static void main(String[] args) {

        int itemPrice = 99;
        double shippingCost = 0;
        double SHIPPING_PERCENT_COST = 0.02;
        if (itemPrice < 100){
            shippingCost = itemPrice * SHIPPING_PERCENT_COST;
        }
        double totalPrice = itemPrice+shippingCost;
        System.out.println("For an item that costs " + itemPrice + " dollars, the shipping cost is " +
                shippingCost + " dollars, for a total of " + totalPrice + " dollars");



    }
}