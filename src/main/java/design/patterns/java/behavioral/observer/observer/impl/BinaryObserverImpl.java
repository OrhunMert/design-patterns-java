package design.patterns.java.behavioral.observer.observer.impl;

import design.patterns.java.behavioral.observer.observer.Observer;
import design.patterns.java.behavioral.observer.subject.Subject;

public class BinaryObserverImpl extends Observer {

    public BinaryObserverImpl(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
