package design.patterns.java.behavioral.chainofresponsibility.component.impl;

import design.patterns.java.behavioral.chainofresponsibility.component.DispenseChain;
import design.patterns.java.behavioral.chainofresponsibility.model.Currency;

import java.util.Collections;
import java.util.Objects;

public class Dollar50Dispenser implements DispenseChain {

    private static final int AMOUNT_FOR_50 = 50;

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

        if (currency.getAmount() >= AMOUNT_FOR_50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                this.nextDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            this.nextDispenseChain.dispense(currency);
        }
    }
}
