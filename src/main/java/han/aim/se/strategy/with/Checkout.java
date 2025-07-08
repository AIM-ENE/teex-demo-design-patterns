package han.aim.se.strategy.with;

class Checkout{

    void processCheckout(PaymentStrategy paymentStrategy){

        // Logic to process payment now handled by implementation class
        paymentStrategy.processPayment();

        // Logic to check out once payment is successful.
        System.out.println("Checkout process completed");
    }
}
