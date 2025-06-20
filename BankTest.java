public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(0, 123456789);

    acc.checkBalance(); 
    acc.deposit(200);
    acc.withdraw(100);
    acc.withdraw(1000); // Overdraft test
    acc.withdraw(100, "");
    }
}
