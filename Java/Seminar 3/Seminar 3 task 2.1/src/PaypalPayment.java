public class PaypalPayment extends Payment {
  private String userEmail;

  public String getUserEmail() {
    return userEmail;
  }

  String emailPattern = "^[A-Za-z0-9_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
  public boolean checkEmail() {
    if (!userEmail.matches(emailPattern)) {
      System.out.println("Your email adress is not valid.");
      return false;
    }
    return true;
  }

  @Override
  public boolean processPayment() {
    System.out.println("Processing paypal payment for the amount: " + amount);
    return checkEmail();
  }

  @Override
  public String getPaymentDetails() {
    return "Amount: " + amount + " Unique paymentID: " + paymentId + " Payment fee: " + calculateFee();
  }

  @Override
  public double calculateFee() {
    return amount * 0.03;
  }
}
