package mh.behavioral.memento;

// Memento
// We use Memento, when we need to store state with old states (undo option)
// classic example – text editor with undo option
// - originator – class’es state which is stored, must implement save and restore state from memento object,
// - memento – class that can store data from originator
// - caretaker – store collection of memento objects and share save and read

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State3");
        caretaker.addMemento( originator.saveToMemento() );
        originator.set("State4");

        originator.restoreFromMemento( caretaker.getMemento(1) );
    }

}
