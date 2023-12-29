package design.patterns.java.behavioral.visitor.element.impl;

import design.patterns.java.behavioral.visitor.element.ItemElement;
import design.patterns.java.behavioral.visitor.visitor.ShoppingCardVisitor;

public class Fruit implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(ShoppingCardVisitor visitor) {
        visitor.visit(this);
    }
}
