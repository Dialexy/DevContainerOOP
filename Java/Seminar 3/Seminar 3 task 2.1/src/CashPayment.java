public class CashPayment extends Payment {
  private boolean isPresent;

  public boolean isPresent() {
    return isPresent;
  }

  @Override
  public boolean processPayment() {
    System.out.println("Processing in-person payment for the amount: " + amount);
    return true;
  }

  @Override
  public String getPaymentDetails() {
   return "Amount: " + amount + " Unique paymentID: " + paymentId + " Payment fee: " + calculateFee();
  }

  @Override
  public double calculateFee() {
    return amount * 0;
  }
}
