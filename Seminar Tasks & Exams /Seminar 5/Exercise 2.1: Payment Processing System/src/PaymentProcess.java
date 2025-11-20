public abstract class PaymentProcess {
  private final double amount;
  private final String paymentType;

  public double getAmount() {
    return amount;
  }

  public String getPaymentType() {
    return paymentType;
  }

  public PaymentProcess(double amount, String paymentType) {
    this.amount = amount;
    this.paymentType = paymentType;
  }

  public abstract void payment();
}
