class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Prob4 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.withdraw(450);  
        account.withdraw(350);  
        System.out.println("Balance: " + account.balance); 
    }
}
