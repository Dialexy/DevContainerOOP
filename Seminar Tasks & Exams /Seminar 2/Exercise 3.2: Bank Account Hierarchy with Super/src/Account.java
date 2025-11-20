import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Account {
  protected double balance;
  protected double depositAmount;
  protected double withdrawAmount;
  private final ArrayList<Transaction> transactions = new ArrayList<>();

  public Account(double balance, double depositAmount, double withdrawAmount) {
    this.balance = balance;
    this.depositAmount = depositAmount;
    this.withdrawAmount = withdrawAmount;
  }

  public double deposit(double newDepositAmount) {
    if (newDepositAmount <= 0) {
      throw new IllegalArgumentException ("Deposit amount must be greater than zero");
    }
    balance += newDepositAmount;
    depositAmount = newDepositAmount;
    transactions.add(new Transaction ("deposit", newDepositAmount, LocalDateTime.now(), balance));
    return balance;
  }

  public double withdraw(double newWithdrawAmount) {
    if (newWithdrawAmount < 0 || newWithdrawAmount > balance) {
      throw new IllegalArgumentException ("Withdrawal amount must be greater than zero");
    }
    balance -= newWithdrawAmount;
    withdrawAmount = newWithdrawAmount;
    transactions.add(new Transaction ("withdrawal", newWithdrawAmount, LocalDateTime.now(), balance));
    return balance;
  }

  public void ValidateBalance() {
    if (balance < 0 || balance > (2^31 - 1)) {
      throw new IllegalArgumentException ("Your straight scamming twin");
    }
    System.out.println("on fonem, your motion valid twin");
  }

  public ArrayList<Transaction> getTransactions() {
    return new ArrayList<>(transactions);
  }
}
