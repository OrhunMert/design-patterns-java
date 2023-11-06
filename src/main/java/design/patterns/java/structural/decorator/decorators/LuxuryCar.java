package design.patterns.java.structural.decorator.decorators;


import design.patterns.java.structural.decorator.component.Car;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("LuxuryCar is running with new special features");
    }
}
