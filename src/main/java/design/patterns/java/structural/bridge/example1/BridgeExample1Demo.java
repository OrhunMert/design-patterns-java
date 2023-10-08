package design.patterns.java.structural.bridge.example1;

public class BridgeExample1Demo {
    public static void main(String[] args) {
        AbstractMoneyAccount usdAccount = new UsdAccount();
        AbstractBank usdManagerOfBankA = new BankA(usdAccount);

        AbstractMoneyAccount euroAccount = new UsdAccount();
        AbstractBank euroManagerOfBankA = new BankA(euroAccount);

        usdManagerOfBankA.depositUsd(250);
        euroManagerOfBankA.depositEuro(480);

        usdManagerOfBankA.account.showBalance();
        euroManagerOfBankA.account.showBalance();
    }
}