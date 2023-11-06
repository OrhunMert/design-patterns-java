package design.patterns.java.structural.proxy.client;

import design.patterns.java.structural.proxy.component.InternetAccess;
import design.patterns.java.structural.proxy.proxy.InternetAccessProxy;

public class ProxyDesignPatternClient {
    public static void main(String[] args) {
        InternetAccess internetAccess = new InternetAccessProxy("Orhun");
        InternetAccess internetAccess2 = new InternetAccessProxy("Mert");

        internetAccess.internetAccessAvailable();
        internetAccess2.internetAccessAvailable();
    }
}