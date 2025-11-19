public class Bitcoin extends PaymentProcess {

  public Bitcoin (double amount, String paymentType) {
    super(amount, paymentType);
  }

  @Override
  public void payment() {
    if (getPaymentType().equals("Bitcoin")) {
      System.out.println ("Processing Bitcoin payment: $" + getAmount());
    }
  }
}
