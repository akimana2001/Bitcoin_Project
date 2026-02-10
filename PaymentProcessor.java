public class PaymentProcessor {
    public void processPayment(CreditCard card) {
        System.out.println("Processing Credit Card Payment");
    }

    public void processPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment");
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment");
    }
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard();
        PayPal paypal = new PayPal();
        Bitcoin bitcoin = new Bitcoin();

        System.out.println("Attempting payment with Credit Card:");
        processor.processPayment(creditCard);

        System.out.println("\nAttempting payment with PayPal:");
        processor.processPayment(paypal);

        System.out.println("\nAttempting payment with Bitcoin:");
        processor.processPayment(bitcoin);
    }
}
