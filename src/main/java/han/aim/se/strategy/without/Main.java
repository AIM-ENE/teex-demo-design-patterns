package han.aim.se.strategy.without;

public class Main {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.processCheckout(PaymentType.CREDIT_CARD);
        checkout.processCheckout(PaymentType.UPI);
    }
}
