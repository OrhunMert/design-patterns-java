package design.patterns.java.structural.bridge.example1;

public class BankA extends AbstractBank {

    // Actually you don't need to this if you use spring boot or lombok annotations
    public BankA(AbstractMoneyAccount account) {
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
