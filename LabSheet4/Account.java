package LabSheet4;

public class Account {
    private int balance;

    public void deposit(int amount) { balance += amount; }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance() { return balance; }
}
