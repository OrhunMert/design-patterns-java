package design.patterns.java.structural.composite.client;


import design.patterns.java.structural.composite.component.Shape;
import design.patterns.java.structural.composite.composite.Drawing;
import design.patterns.java.structural.composite.leaf.Circle;
import design.patterns.java.structural.composite.leaf.Triangle;

public class CompositeMainDemo {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();

        // Composite - subclass of shape
        Drawing drawing = new Drawing();

        // Shape drawing = new Drawing() can not access to the addShape(...) method
        drawing.addShape(triangle);
        drawing.addShape(circle);

        drawing.draw("Blue");
    }
}