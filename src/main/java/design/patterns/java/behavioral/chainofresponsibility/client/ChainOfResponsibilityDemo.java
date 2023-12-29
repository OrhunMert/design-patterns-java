package design.patterns.java.behavioral.chainofresponsibility.client;

import design.patterns.java.behavioral.chainofresponsibility.component.DispenseChain;
import design.patterns.java.behavioral.chainofresponsibility.component.impl.Dollar10Dispenser;
import design.patterns.java.behavioral.chainofresponsibility.component.impl.Dollar20Dispenser;
import design.patterns.java.behavioral.chainofresponsibility.component.impl.Dollar50Dispenser;
import design.patterns.java.behavioral.chainofresponsibility.model.Currency;

import java.util.Scanner;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        DispenseChain dispenseChain50 = new Dollar50Dispenser();
        DispenseChain dispenseChain20 = new Dollar20Dispenser();
        DispenseChain dispenseChain10 = new Dollar10Dispenser();

        dispenseChain50.setNextChain(dispenseChain20);
        dispenseChain20.setNextChain(dispenseChain10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("input amount to dispense");
        int amount = scanner.nextInt();

        if (amount == 0 || amount % 10 != 0) {
            System.out.println("amount must be divisible by 10");
            return;
        }

        dispenseChain50.dispense(new Currency(amount));
    }
}
