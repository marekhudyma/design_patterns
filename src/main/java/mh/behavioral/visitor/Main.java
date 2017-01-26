package mh.behavioral.visitor;

import mh.behavioral.visitor.computerPart.Visitable;

// Visitor
// - You can add new functionality without changing classes code
// - You collect all possibilities in one place
// Disadvantages:
// visitor sometimes need to have access to internal state (than you need to relax encapsulation)
public class Main {

    public static void main(String[] args) {
        Visitable computer = new Computer();
        computer.accept(new DisplayVisitor());
    }

}
