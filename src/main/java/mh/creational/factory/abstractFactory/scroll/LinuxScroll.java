package mh.creational.factory.abstractFactory.scroll;

public class LinuxScroll implements Scroll {

    @Override
    public void draw() {
        System.out.println("Inside LinuxScroll::draw() method.");
    }

}
