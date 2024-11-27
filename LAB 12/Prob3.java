class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds to withdraw: " + amount);
        }
    }
} 

class AccountThread extends Thread {
    private BankAccount account;
    private boolean deposit;
    private int amount;

    public AccountThread(BankAccount account, boolean deposit, int amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class Prob3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new AccountThread(account, true, 500);
        Thread t2 = new AccountThread(account, false, 700);

        t1.start();
        t2.start();
    }
}