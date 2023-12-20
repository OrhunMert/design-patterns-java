package design.patterns.java.behavioral.visitor.visitor.impl;

import design.patterns.java.behavioral.visitor.element.impl.Book;
import design.patterns.java.behavioral.visitor.element.impl.Fruit;
import design.patterns.java.behavioral.visitor.visitor.ShoppingCardVisitor;

public class ShoppingCardVisitorImpl implements ShoppingCardVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit " + fruit.getName() + " cost = " + cost);
        return cost;
    }
}
