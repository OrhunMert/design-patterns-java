package design.patterns.java.structural.decorator.component;

public class BasicCar implements Car {

    @Override
    public void run() {
        System.out.println("Basic car is running!");
    }
}
