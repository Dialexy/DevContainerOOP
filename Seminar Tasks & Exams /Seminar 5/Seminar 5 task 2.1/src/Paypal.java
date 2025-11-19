public class Paypal extends PaymentProcess {

  public Paypal (double amount, String paymentType) {
    super(amount, paymentType);
  }

  @Override
  public void payment() {
    if (getPaymentType().equals("Paypal")) {
      System.out.println ("Processing Paypal payment: $" + getAmount());
    }
  }
}

