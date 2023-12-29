package design.patterns.java.behavioral.strategy.client;

import design.patterns.java.behavioral.strategy.context.Context;
import design.patterns.java.behavioral.strategy.strategy.Strategy;
import design.patterns.java.behavioral.strategy.strategy.impl.AddStrategy;
import design.patterns.java.behavioral.strategy.strategy.impl.SubstractStrategy;

public class StrategyDesignPatternClient {

    public static void main(String[] args) {
        // the best example for open-closed implementation
        Strategy addStrategy = new AddStrategy();
        Strategy substractStrategy = new SubstractStrategy();

        int number1 = 7;
        int number2 = 5;

        Context addContext = new Context(addStrategy);
        Context substractContext = new Context(substractStrategy);

        System.out.println("add result:" + addContext.execute(number1, number2));
        System.out.println("substract result:" + substractContext.execute(number1, number2));
    }
}
