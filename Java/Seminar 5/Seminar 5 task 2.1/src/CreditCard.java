public class CreditCard extends PaymentProcess {

  public CreditCard (double amount, String paymentType) {
    super(amount, paymentType);
  }

  @Override
  public void payment() {
    if (getPaymentType().equals("Credit card")) {
      System.out.println("Processing credit card payment: $" + getAmount());
    }
  }
}
