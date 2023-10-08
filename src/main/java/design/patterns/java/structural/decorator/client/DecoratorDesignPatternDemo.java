package design.patterns.java.structural.decorator.client;

import design.patterns.java.structural.decorator.component.BasicCar;
import design.patterns.java.structural.decorator.component.Car;
import design.patterns.java.structural.decorator.decorators.LuxuryCar;
import design.patterns.java.structural.decorator.decorators.SportsCar;

public class DecoratorDesignPatternDemo {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        Car luxuryCar = new LuxuryCar(new BasicCar());

        sportsCar.run();
        luxuryCar.run();
    }
}