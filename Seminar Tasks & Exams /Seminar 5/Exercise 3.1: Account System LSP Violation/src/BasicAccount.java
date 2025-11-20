public class BasicAccount implements Account {
    protected double balance;

    public BasicAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean canWithdraw(double amount) {
        return amount <= balance;
    }

    @Override
    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
