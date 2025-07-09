// This class represents a bank account with basic operations like deposit and withdrawal.
// It includes error handling for invalid operations such as negative deposits and insufficient funds for withdrawals.

package bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        try {
            if (amount > 0) {
                balance += amount;
            } else {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
//Original withdraw method
    public void withdraw(double amount) {
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds for withdrawal.");
            } else {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

        // Overloaded withdraw method with a custom message
    public void withdraw(double amount, String message) {
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of R" + amount + " successful. Message: " + message);
            } else if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds for withdrawal.");
            } else {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
