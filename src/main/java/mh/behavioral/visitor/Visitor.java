package mh.behavioral.visitor;

import mh.behavioral.visitor.computerPart.Keyboard;
import mh.behavioral.visitor.computerPart.Monitor;
import mh.behavioral.visitor.computerPart.Mouse;

public interface Visitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);

}
