import java.time.LocalDate;

public class FixedDepositAccount implements Account {
    private final double balance;
    private final LocalDate maturityDate;

    public FixedDepositAccount(double balance, LocalDate maturityDate) {
        this.balance = balance;
        this.maturityDate = maturityDate;
    }

    @Override
    public boolean canWithdraw(double amount) {
        return LocalDate.now().isAfter(maturityDate);
    }

    @Override
    public void withdraw(double amount) {
        if (!canWithdraw(amount)) {
            System.out.println("Cannot withdraw before maturity!");
        } else {
            System.out.println("Withdrawal processed!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
