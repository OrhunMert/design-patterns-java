package design.patterns.java.structural.proxy.component.impl;

import design.patterns.java.structural.proxy.component.InternetAccess;

public class InternetAccessImpl implements InternetAccess {

    private String employeeName;

    public InternetAccessImpl(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void internetAccessAvailable() {
        System.out.println("Internet Access Available for " + this.employeeName);
    }
}
