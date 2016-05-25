package mh.behavioral.visitor.computerPart;

import mh.behavioral.visitor.Visitor;

public interface Visitable {

    void accept(Visitor visitor);

}
