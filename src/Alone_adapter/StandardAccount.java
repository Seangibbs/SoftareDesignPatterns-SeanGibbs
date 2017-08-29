package Alone_adapter;


public class StandardAccount extends AbstractAccount {

    public StandardAccount(double balance) {
        super(balance);
        setIsOverDraftAvailable(false);
    }
}
