package han.aim.se.strategy.with;

public class Main {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.processCheckout(new CreditcardPayment());
        checkout.processCheckout(new UPIPayment());
    }
}
