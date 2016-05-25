package mh.behavioral.state.states;

import mh.behavioral.state.StateContext;

public class StopState implements State {

    public void execute(StateContext stateContext) {
        System.out.println("StopState executed");
    }

}
