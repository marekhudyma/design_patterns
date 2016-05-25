package mh.behavioral.state.states;

import mh.behavioral.state.StateContext;

public class MidState  implements State {

    public void execute(StateContext stateContext) {
        System.out.println("MidState executed");

        stateContext.setState(new StopState());
    }

}
