package design.patterns.java.behavioral.state.state.impl;

import design.patterns.java.behavioral.state.context.Context;
import design.patterns.java.behavioral.state.state.State;

public class StartStateImpl implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Start");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
