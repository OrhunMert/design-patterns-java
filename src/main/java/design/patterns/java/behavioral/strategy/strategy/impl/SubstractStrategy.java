package design.patterns.java.behavioral.strategy.strategy.impl;

import design.patterns.java.behavioral.strategy.strategy.Strategy;

public class SubstractStrategy implements Strategy {

    @Override
    public int calculate(int number1, int number2) {
        return number1 - number2;
    }
}
