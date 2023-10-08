package design.patterns.java.structural.decorator.decorators;


import design.patterns.java.structural.decorator.component.Car;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("SportsCar is running with new special features");
    }
}
