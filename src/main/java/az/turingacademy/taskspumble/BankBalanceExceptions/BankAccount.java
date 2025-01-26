package az.turingacademy.taskspumble.BankBalanceExceptions;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw (double amount) throws InsufficientException {
        if (amount>balance) {
            throw new InsufficientException("Balans kifayet etmir");
        } balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
