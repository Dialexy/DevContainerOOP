public class Applepay extends PaymentProcess {

  public Applepay (double amount, String paymentType) {
    super(amount, paymentType);
  }

  @Override
  public void payment() {
    if (getPaymentType().equals("Apple pay")) {
      System.out.println("Processing Applepay payment: $" + getAmount());
    }
  }
}
