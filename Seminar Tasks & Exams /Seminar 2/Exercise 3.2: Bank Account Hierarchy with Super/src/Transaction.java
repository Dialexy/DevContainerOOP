import java.time.LocalDateTime;

public class Transaction {
  private String type;
  private double amount;
  private LocalDateTime timestamp;
  private double balanceAfter;

  public Transaction(String type, double amount, LocalDateTime timestamp, double balanceAfter) {
    this.type = type;
    this.amount = amount;
    this.timestamp = timestamp;
    this.balanceAfter = balanceAfter;
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDateTime getTimeStamp() {
    return timestamp;
  }

  public double getBalanceAfter() {
    return balanceAfter;
  }

  @Override
   public String toString() {
     return timestamp + " | " + type + " | " + amount + " | Balance: " + balanceAfter;
   }
}
