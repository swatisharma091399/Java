package LabSheet4;

public class code15 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5.0);
        sa.deposit(1000);
        sa.applyInterest();
        System.out.println("Balance after interest: " + sa.getBalance());
    }
}
