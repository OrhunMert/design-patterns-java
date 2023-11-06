package design.patterns.java.structural.bridge.example1alternative;

abstract class AbstractBank {
    protected AbstractMoneyAccount account;

    AbstractBank(AbstractMoneyAccount account) {
        this.account = account;
    }

    abstract void deposit(double amount);
}
