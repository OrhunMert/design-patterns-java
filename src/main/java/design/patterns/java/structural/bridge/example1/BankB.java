package design.patterns.java.structural.bridge.example1;

public class BankB extends AbstractBank {

    public BankB(AbstractMoneyAccount account) {
        super(account);
    }

    @Override
    void depositUsd(double amount) {
        account.deposit(amount);
    }

    @Override
    void depositEuro(double amount) {
        account.deposit(amount);
    }
}
