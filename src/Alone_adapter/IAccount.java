package Alone_adapter;


public interface IAccount {
    double getBalance();

    boolean isOverDraftAvailable();

    void creditAcc(double credit);
}
