package design.patterns.java.behavioral.observer.subject;

import design.patterns.java.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(); // subject field or fields are updated so you need to notify them.
    }

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
