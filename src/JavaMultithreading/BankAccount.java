package JavaMultithreading;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void winthdraw(double amount) {
        balance += amount;
    }

    public synchronized double getBalance() {
        return balance;
    }

}
