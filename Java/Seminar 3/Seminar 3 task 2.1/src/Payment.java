public abstract class Payment {
  protected double amount;
  protected String paymentId;
  protected String date;

  public abstract boolean processPayment();
  public abstract String getPaymentDetails();
  public abstract double calculateFee();
}
