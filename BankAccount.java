public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Not enough balance!"
            );
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}