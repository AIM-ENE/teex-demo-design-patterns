package han.aim.se.strategy.with;

class UPIPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Processing payment using " + PaymentType.UPI);
    }

}
