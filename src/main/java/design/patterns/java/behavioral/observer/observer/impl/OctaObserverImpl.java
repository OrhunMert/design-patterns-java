package design.patterns.java.behavioral.observer.observer.impl;

import design.patterns.java.behavioral.observer.observer.Observer;
import design.patterns.java.behavioral.observer.subject.Subject;

public class OctaObserverImpl extends Observer {

    public OctaObserverImpl(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
