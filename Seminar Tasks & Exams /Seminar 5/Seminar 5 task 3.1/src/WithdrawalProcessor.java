public class WithdrawalProcessor {
    public void process(Account account, double amount) {
        if (account.canWithdraw(amount)) {
            account.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed.");
        }
    }
}
