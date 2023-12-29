package design.patterns.java.behavioral.visitor.visitor;

import design.patterns.java.behavioral.visitor.element.impl.Book;
import design.patterns.java.behavioral.visitor.element.impl.Fruit;

public interface ShoppingCardVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
