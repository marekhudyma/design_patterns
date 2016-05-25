package mh.behavioral.state.states;

import mh.behavioral.state.StateContext;

public class StartState implements State {

    public void execute(StateContext stateContext) {
        System.out.println("StartState executed");

        stateContext.setState(new MidState());
    }

}
