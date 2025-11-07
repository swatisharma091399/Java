package LabSheet4;

public class code02 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(5.0);
        sa.deposit(1000);
        sa.withdraw(200);
        System.out.println("Interest rate: 5%");
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double rate) {
        this.interestRate = rate;
    }

    public void applyInterest() {
        deposit((int)(getBalance() * interestRate / 100));
    }
}
