package design.patterns.java.structural.proxy.proxy;

import design.patterns.java.structural.proxy.component.InternetAccess;
import design.patterns.java.structural.proxy.component.impl.InternetAccessImpl;

public class InternetAccessProxy implements InternetAccess {

    private InternetAccessImpl internetAccess;
    private String employeeName;

    public InternetAccessProxy(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void internetAccessAvailable() {

        if (getRole(this.employeeName) > 5) {

            internetAccess = new InternetAccessImpl(this.employeeName);
            internetAccess.internetAccessAvailable();
        } else {
            System.out.println("Internet access is not available for " + employeeName);
        }
    }

    private int getRole(String employeeName) {
        // can be here some employeeName conditions (if else - switch - different models)
        return 7;
    }
}
