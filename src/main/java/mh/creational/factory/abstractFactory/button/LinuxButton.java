package mh.creational.factory.abstractFactory.button;

public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Inside LinuxButton::paint() method.");
    }

}
