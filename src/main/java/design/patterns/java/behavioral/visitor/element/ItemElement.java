package design.patterns.java.behavioral.visitor.element;

import design.patterns.java.behavioral.visitor.visitor.ShoppingCardVisitor;

public interface ItemElement {
    void accept(ShoppingCardVisitor visitor);
}
