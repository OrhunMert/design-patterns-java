package design.patterns.java.behavioral.strategy.context;

import design.patterns.java.behavioral.strategy.strategy.Strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int number1, int number2) {
        return strategy.calculate(number1, number2);
    }
}
