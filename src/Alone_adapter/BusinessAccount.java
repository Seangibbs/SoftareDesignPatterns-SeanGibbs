package Alone_adapter;


public class BusinessAccount extends AbstractAccount {

    public BusinessAccount(double balance) {
        super(balance);
        setIsOverDraftAvailable(true);
    }
}
