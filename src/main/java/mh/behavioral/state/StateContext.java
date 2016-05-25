package mh.behavioral.state;

import mh.behavioral.state.states.StartState;
import mh.behavioral.state.states.State;

public class StateContext {

    private State state = new StartState();

    public void execute() {
        state.execute(this);
    }

    public void setState(State state) {
        this.state = state;
    }

}
