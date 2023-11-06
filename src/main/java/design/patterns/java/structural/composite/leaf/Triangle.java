package design.patterns.java.structural.composite.leaf;


import design.patterns.java.structural.composite.component.Shape;

public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
