package mh.behavioral.visitor.computerPart;

import mh.behavioral.visitor.Visitor;

public class Keyboard implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
