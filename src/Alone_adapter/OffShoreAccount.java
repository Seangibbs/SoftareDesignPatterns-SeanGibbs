package Alone_adapter;


public class OffShoreAccount {
    private double balance;

   
    private final double TAX_RATE = 0.04;

    public OffShoreAccount(double balance) {
        this.balance = balance;
    }

    public double getTaxRate() {
        return TAX_RATE;
    }

    public double getOffshoreBalance() {
        return balance;
    }

    public void debit(double debit) {
        if (balance >= debit) {
            balance -= debit;
        }
    }

    public void credit(double credit) {
        balance += credit;
    }
}
