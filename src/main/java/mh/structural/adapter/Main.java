package mh.structural.adapter;

//Adapter -class pattern (extends)
// - cannot emulate class with all child classes, because when you define class, you must to define extended class
// - emulated methods overrides the original, but other are still available,
//
// Adapter – object pattern – composition (has a reference to object)
// - you can emulate all derived classes, because instance can be given as constructor parameter
// - you have to define all methods that have to be emulated
public class Main {

    public static void main(String[] args) {
        Required adapter = new Adapter();
        System.out.println(adapter.getNumbersAsString());
    }
}
