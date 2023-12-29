package design.patterns.java.behavioral.state.context;

import design.patterns.java.behavioral.state.state.State;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
