package mh.behavioral.visitor.computerPart;

import mh.behavioral.visitor.Visitor;

public class Mouse implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
