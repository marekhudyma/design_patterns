package mh.behavioral.state;

// State
// - we use State when functionality of object depends on his state
// - Instead of implementing methods:
// -if stateA execute .., if stateB execute …
// - create an interface State and as many implementation as many there is states.
// - client works with class Context, which delegates invocations to the proper implementation of State
// - when state is changing, object Context changes a reference
public class Main {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        stateContext.execute();
        stateContext.execute();
        stateContext.execute();
    }

}
