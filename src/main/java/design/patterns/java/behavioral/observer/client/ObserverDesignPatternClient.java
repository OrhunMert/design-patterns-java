package design.patterns.java.behavioral.observer.client;

import design.patterns.java.behavioral.observer.observer.Observer;
import design.patterns.java.behavioral.observer.observer.impl.BinaryObserverImpl;
import design.patterns.java.behavioral.observer.observer.impl.HexaObserverImpl;
import design.patterns.java.behavioral.observer.observer.impl.OctaObserverImpl;
import design.patterns.java.behavioral.observer.subject.Subject;

public class ObserverDesignPatternClient {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserverImpl(subject);
        Observer hexaObserver = new HexaObserverImpl(subject);
        Observer octaObserver = new OctaObserverImpl(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);
    }
}
