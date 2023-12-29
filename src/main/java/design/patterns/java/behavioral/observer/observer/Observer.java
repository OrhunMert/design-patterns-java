package design.patterns.java.behavioral.observer.observer;

import design.patterns.java.behavioral.observer.subject.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
