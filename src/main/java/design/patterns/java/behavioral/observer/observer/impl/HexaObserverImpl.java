package design.patterns.java.behavioral.observer.observer.impl;

import design.patterns.java.behavioral.observer.observer.Observer;
import design.patterns.java.behavioral.observer.subject.Subject;

public class HexaObserverImpl extends Observer {

    public HexaObserverImpl(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
