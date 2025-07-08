package han.aim.se.strategy.without;

class Checkout{

    void processCheckout(PaymentType paymentType){

        if(paymentType == PaymentType.CREDIT_CARD){
            System.out.println("Processing payment using " + PaymentType.CREDIT_CARD);
        }
        else if(paymentType == PaymentType.DEBIT_CARD){
            System.out.println("Processing payment using " + PaymentType.DEBIT_CARD);
        }
        else if(paymentType == PaymentType.UPI){
            System.out.println("Processing payment using " + PaymentType.UPI);
        }
        else if(paymentType == PaymentType.WALLET){
            System.out.println("Processing payment using " + PaymentType.WALLET);
        }

        // Logic to check out once payment is successful.

        System.out.println("Checkout process completed");
    }
}
