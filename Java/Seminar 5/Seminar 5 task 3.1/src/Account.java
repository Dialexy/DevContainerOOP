public interface Account {
    boolean canWithdraw(double amount);
    void withdraw(double amount);
    double getBalance();
}
