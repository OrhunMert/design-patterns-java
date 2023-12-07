package design.patterns.java.behavioral.state.client;

import design.patterns.java.behavioral.state.context.Context;
import design.patterns.java.behavioral.state.state.impl.StartStateImpl;
import design.patterns.java.behavioral.state.state.impl.StopStateImpl;

public class StateDesignPatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartStateImpl startState = new StartStateImpl();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopStateImpl stopState = new StopStateImpl();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
