abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void addInterest() {
        balance += balance * interestRate / 100;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Prob2 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S123", 1000, 5);
        savings.deposit(500);
        savings.withdraw(300);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        SavingsAccount sa = (SavingsAccount) savings;
        sa.addInterest();
        System.out.println("Savings Account Balance after Interest: " + sa.getBalance());

        BankAccount checking = new CheckingAccount("C456", 500, 200);
        checking.deposit(200);
        checking.withdraw(800);
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
