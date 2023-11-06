package design.patterns.java.structural.composite.composite;


import design.patterns.java.structural.composite.component.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void removeShape(Shape shape) {
        shapeList.remove(shape);
    }

    @Override
    public void draw(String color) {
        shapeList.forEach(shape -> shape.draw(color));
    }
}
