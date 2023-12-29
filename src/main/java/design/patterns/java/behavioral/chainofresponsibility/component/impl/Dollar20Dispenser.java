package design.patterns.java.behavioral.chainofresponsibility.component.impl;

import design.patterns.java.behavioral.chainofresponsibility.component.DispenseChain;
import design.patterns.java.behavioral.chainofresponsibility.model.Currency;

import java.util.Objects;

public class Dollar20Dispenser implements DispenseChain {

    private static final int AMOUNT_FOR_20 = 20;

    private DispenseChain nextDispenseChain;

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.nextDispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (Objects.isNull(currency)) {
            System.out.println("Currency is null");
            return;
        }

        if (currency.getAmount() >= AMOUNT_FOR_20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                this.nextDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextDispenseChain.dispense(currency);
        }
    }
}
