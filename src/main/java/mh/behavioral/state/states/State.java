package mh.behavioral.state.states;

import mh.behavioral.state.StateContext;

public interface State {

    public void execute(StateContext stateContext);
}
