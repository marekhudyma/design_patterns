package mh.behavioral.visitor;

import mh.behavioral.visitor.computerPart.Keyboard;
import mh.behavioral.visitor.computerPart.Visitable;
import mh.behavioral.visitor.computerPart.Monitor;
import mh.behavioral.visitor.computerPart.Mouse;

public class Computer implements Visitable {

    private Visitable[] parts;

    public Computer(){
        parts = new Visitable[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
