package design.patterns.java.structural.bridge.example1alternative;

abstract class AbstractMoneyAccount implements MonyunAccount {

    private double totalAmount;
    protected boolean isActive;

    AbstractMoneyAccount() {
        this.totalAmount = 0;
        this.isActive = true;
    }

    AbstractMoneyAccount(double totalAmount) {
        this.totalAmount = totalAmount;
        this.isActive = true;
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
        System.out.println("total amount:" + this.totalAmount);
    }
}
