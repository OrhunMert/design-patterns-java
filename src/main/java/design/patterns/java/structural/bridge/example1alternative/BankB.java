package design.patterns.java.structural.bridge.example1alternative;

import java.util.Objects;

public class BankB extends AbstractBank {

    BankB(AbstractMoneyAccount account) {
        super(account);
    }

    @Override
    void deposit(double amount) {
        if (Objects.nonNull(account)) {
            account.deposit(amount);
        }
    }
}
