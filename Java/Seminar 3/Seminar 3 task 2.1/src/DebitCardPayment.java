public class DebitCardPayment extends Payment {
  private String pin;

  public String getPin() {
    return pin;
  }

  public boolean checkPin() {
    if (getPin().matches(paymentId)) {
      System.out.println("Your pin has been entered sucessfully.");
      return true;
    }
    else {
      System.out.println("The pin you entered is incorrect.");
      return false;
    }
  }

  @Override
  public String getPaymentDetails() {
    return "Amount: " + amount + " Unique PaymentID: " + paymentId + " Payment Fee: " + calculateFee();
  }

  @Override
  public boolean processPayment() {
    System.out.println("Processing debit card payment for the amount: " + amount);
    return checkPin();
  }

  @Override
  public double calculateFee() {
    return amount * 0.015;
  }
}
