public class BankAccount {
  private String accountNumber;
  private double balance;
  private String accountHolder;

  public BankAccount (String accountNumber, double balance, String accountHolder) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolder = accountHolder;
  }

  public void getAccountInfo() {
    System.out.println("Account Holder " + getAccountHolderName());
    System.out.println("Accout Number: " + getAccountNumber());
    System.out.println("Balance: " + getBalance());
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolderName() {
    return accountHolder;
  }

  public double deposit(double deposit) {
    if (deposit > 0) {
      balance += deposit;
    }
    return balance;
  }

  public double withdrawal(double withdrawl) {
    if (withdrawl > 0 && withdrawl < balance) {
      balance -= withdrawl;
    }
    return balance;
  }

  public void transfer(BankAccount other, double amount) {
    if (amount > 0 && this.balance >= amount) {
      this.balance -= amount;
      other.balance += amount;
      System.out.println("$" + amount + " from " + getAccountHolderName() + " has been transferred to " + other.getAccountHolderName());
    }
    else {
      System.out.println("Transfer unsuccessful: invalid amount or insufficient funds");
    }
  }
}
