package design.patterns.java.structural.bridge.example1;

abstract class AbstractMoneyAccount implements MoneyAccount {

    protected double totalAmount;
    protected boolean isActive;

    public AbstractMoneyAccount() {
        totalAmount = 0;
        isActive = true;
    }

    @Override
    public void deposit(double amount) {
        if (isActive) {
            totalAmount -= amount;
        }
    }

    @Override
    public void witdraw(double amount) {
        if (isActive) {
            totalAmount += amount;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("account amount:" + this.totalAmount);
    }
}
