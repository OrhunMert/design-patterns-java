package design.patterns.java.behavioral.visitor.element.impl;

import design.patterns.java.behavioral.visitor.element.ItemElement;
import design.patterns.java.behavioral.visitor.visitor.ShoppingCardVisitor;

public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }


    @Override
    public void accept(ShoppingCardVisitor visitor) {
        visitor.visit(this);
    }
}
