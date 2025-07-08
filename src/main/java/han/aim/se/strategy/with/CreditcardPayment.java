package han.aim.se.strategy.with;

class CreditcardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing payment using " + PaymentType.CREDIT_CARD);
    }

}
