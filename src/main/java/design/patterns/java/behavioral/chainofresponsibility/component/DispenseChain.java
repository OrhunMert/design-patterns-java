package design.patterns.java.behavioral.chainofresponsibility.component;

import design.patterns.java.behavioral.chainofresponsibility.model.Currency;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);
    void dispense(Currency currency);
}