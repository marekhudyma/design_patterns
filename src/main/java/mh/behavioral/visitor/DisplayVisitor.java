package mh.behavioral.visitor;

import mh.behavioral.visitor.computerPart.Keyboard;
import mh.behavioral.visitor.computerPart.Monitor;
import mh.behavioral.visitor.computerPart.Mouse;

public class DisplayVisitor implements Visitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

}
