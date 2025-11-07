package LabSheet4;

public class code01 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());
    }
}
