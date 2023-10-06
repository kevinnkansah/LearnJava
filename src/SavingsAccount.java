// SavingsAccount.java
// Child class SavingsAccount
public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied: Insufficient balance");
        } else {
            super.withdraw(amount);
        }
    }

}