package design.patterns.java.structural.decorator.decorators;


import design.patterns.java.structural.decorator.component.Car;

public class CarDecorator implements Car {

    // take here that Basıc card all features

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        this.car.run();
    }
}
