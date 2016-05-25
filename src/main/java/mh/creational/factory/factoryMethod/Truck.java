package mh.creational.factory.factoryMethod;

public class Truck implements Vehicle {

    public void refuel() {
        System.out.println(getInfo() + "Truck refueling");
    }

    public void checkLiquids() {
        System.out.println(getInfo() + "Truck checking liquids");
    }

    public void changeBattery() {
        System.out.println(getInfo() + "Truck changing battery");
    }

    public void test() {
        System.out.println("Truck " + getInfo() + " is ready");
    }

    public String getInfo() {
        return "[" + this.hashCode() + "(" + this.getClass() + ")] ";
    }

}
