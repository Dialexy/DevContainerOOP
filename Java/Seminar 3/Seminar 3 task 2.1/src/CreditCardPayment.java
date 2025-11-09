public class CreditCardPayment extends Payment {
  private double cost;

  public double getCost() {
    return cost;
  }

  String creditCardPattern = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
  public boolean validCreditCardCheck() {
    if (!paymentId.matches(creditCardPattern)) {
      System.out.println("The card number you entered is not valid.");
      return false;
    }
    else {
      System.out.println("Your card details are valid.");
      return true;
    }
  }

  @Override
  public String getPaymentDetails() {
    return "Amount: " + amount + " Unique paymentID: " + paymentId + " Payment fee: " + calculateFee();
  }

  @Override
  public boolean processPayment() {
    System.out.println("Processing Credit card payment for the amount: " + amount);
    return validCreditCardCheck();
  }


    @Override
    public double calculateFee() {
      return amount * 0.025;
    }
}
