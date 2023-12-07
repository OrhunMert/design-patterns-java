package design.patterns.java.behavioral.state.state;

import design.patterns.java.behavioral.state.context.Context;

public interface State {
    void doAction(Context context);
}
