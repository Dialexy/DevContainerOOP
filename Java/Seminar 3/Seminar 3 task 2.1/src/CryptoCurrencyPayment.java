public class CryptoCurrencyPayment extends Payment {
  private String walletAddress;

  public String getWalletAddress() {
    return walletAddress;
  }

  @Override
  public boolean processPayment() {
    System.out.println("Processing crypto payment in the amount: " + amount);
    return true;
  }

  @Override
  public String getPaymentDetails() {
    return "Amount: " + amount + " Unique paymentID: " + paymentId + " Payment fee: " + calculateFee();
  }

  @Override
  public double calculateFee() {
    return amount * 0.01;
  }
}
