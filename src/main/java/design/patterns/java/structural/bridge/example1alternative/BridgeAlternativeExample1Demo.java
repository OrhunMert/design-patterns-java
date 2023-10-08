package design.patterns.java.structural.bridge.example1alternative;

public class BridgeAlternativeExample1Demo {

    public static void main(String[] args) {

        AbstractMoneyAccount usdAccount = new UsdAccount(10);
        AbstractBank usdAccountBankA = new BankA(usdAccount);

        AbstractMoneyAccount euroAccount = new EuroAccount(100);
        AbstractBank euroAccountBankA = new BankA(euroAccount);

        usdAccountBankA.deposit(5);
        euroAccountBankA.deposit(50);

        usdAccountBankA.account.showBalance();
        euroAccountBankA.account.showBalance();
    }
}
