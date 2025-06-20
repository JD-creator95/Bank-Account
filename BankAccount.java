public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount(double bal, int accNum) {
        balance = bal;
        accountNumber = accNum;
    }
//method to check balance        
    public void checkBalance() {
        System.out.println ("Your balance is: " + balance);
        
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        accountNumber = newAccountNumber;
    }
//deposit method 
    public void deposit(double depAmount) {
        if (depAmount == 0) {
            System.out.println("Deposit amount cannot be zero.");
        } else {
            balance += depAmount;
            System.out.println("Deposit successful. Your new balance is: " + balance);
        }
    }
//withdrawal method
    public void withdraw(double drawAmount) {
        if (drawAmount < 10) {
            System.out.println("Withdrawal amount cannot be less than R10.");            
        } else if (drawAmount > balance) {
            System.out.println("Insufficient funds");
        }else {
             balance -= drawAmount;
             System.out.println("Withdrawal Successful. Your new balance is: " + "R" + balance);
            }
        }
//Overloaded withdrawal method with message
    public void withdraw( double drawAmount, String message) {
        System.out.println("Withdrawal amount: " + "R" + drawAmount);
        message = "Please take your cash!";
        System.out.println(message);
        withdraw(drawAmount);
    }

}