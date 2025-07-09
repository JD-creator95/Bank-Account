package testing;
// This class is used to test the program.

import bank.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: R" + account.getBalance());

        account.deposit(500.0);
        System.out.println("Deposit successful! Balance after deposit: R" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Withdrawal successful! Balance after withdrawal: R" + account.getBalance());

        account.withdraw(1500.0); // This should trigger an error message
        System.out.println("Balance after attempted withdrawal: R" + account.getBalance());

        account.deposit(-100.0); // This should trigger an error message
        System.out.println("Balance after attempted negative deposit: R" + account.getBalance());

        // Testing the overloaded withdraw method with a custom message
        account.withdraw(100.0, "Withdrawing funds for shopping");
    
    }
}
