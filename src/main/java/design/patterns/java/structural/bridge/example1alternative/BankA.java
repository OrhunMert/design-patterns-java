package design.patterns.java.structural.bridge.example1alternative;

import java.util.Objects;

public class BankA extends AbstractBank {

    BankA(AbstractMoneyAccount account) {
        super(account);
    }

    @Override
    void deposit(double amount) {
        if (Objects.nonNull(account)) {
            account.deposit(amount);
        }
    }
}
