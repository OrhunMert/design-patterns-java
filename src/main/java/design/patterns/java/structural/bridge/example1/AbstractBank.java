package design.patterns.java.structural.bridge.example1;

abstract class AbstractBank {

    protected AbstractMoneyAccount account;

    // Actually you don't need to this if you use spring boot or lombok annotations
    AbstractBank(AbstractMoneyAccount account) {
        this.account = account;
    }

    abstract void depositUsd(double amount);
    abstract void depositEuro(double amount);
}
