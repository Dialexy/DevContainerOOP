public class PaymentProcessor {

  public void processAllPayments(Payment[] payments) {
    double totalFees = 0;

    for (Payment p : payments) {
      System.out.println("=============================================");
      boolean success = p.processPayment();

      if (success) {
        System.out.println("The payment was successful.");
        System.out.println(p.getPaymentDetails());
        totalFees += p.calculateFee();
      }
      else {
        System.out.println("The payment has failed.");
      }
    }
     System.out.println("=============================================");
     System.out.printf("Total fees collected: $%.2f%n", totalFees);
  }
}
