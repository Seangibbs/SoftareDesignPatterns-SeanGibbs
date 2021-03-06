package Alone_adapter;


public class AccountAdapter extends AbstractAccount {

    private OffShoreAccount offShoreAccount;

    public AccountAdapter(OffShoreAccount offShoreAccount) {
        super(offShoreAccount.getOffshoreBalance());
        this.offShoreAccount = offShoreAccount;
    }

    public double getBalance() {
        final double taxRate = offShoreAccount.getTaxRate();
        double grossBalance = offShoreAccount.getOffshoreBalance();
        double taxableBalance = grossBalance * taxRate;
        return grossBalance - taxableBalance;
    }

}
