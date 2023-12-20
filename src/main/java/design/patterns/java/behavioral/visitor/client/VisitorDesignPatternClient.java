package design.patterns.java.behavioral.visitor.client;

import design.patterns.java.behavioral.visitor.element.ItemElement;
import design.patterns.java.behavioral.visitor.element.impl.Book;
import design.patterns.java.behavioral.visitor.element.impl.Fruit;
import design.patterns.java.behavioral.visitor.visitor.ShoppingCardVisitor;
import design.patterns.java.behavioral.visitor.visitor.impl.ShoppingCardVisitorImpl;

public class VisitorDesignPatternClient {

    public static void main(String[] args) {
        Book bookElement = new Book(5, "1234");
        Fruit fruitElement = new Fruit(8, 7, "12345");

        ShoppingCardVisitor cardVisitor = new ShoppingCardVisitorImpl();
        cardVisitor.visit(bookElement);
        cardVisitor.visit(fruitElement);
    }
}
