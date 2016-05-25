package mh.creational.factory.factoryMethod;

public class Car implements Vehicle {

    public void refuel() {
        System.out.println(getInfo() + "Car refueling");
    }

    public void checkLiquids() {
        System.out.println(getInfo() + "Car checking liquids");
    }

    public void changeBattery() {
        System.out.println(getInfo() + "Car changing battery");
    }

    public void test() {
        System.out.println("Car " + getInfo() + " is ready");
    }

    public String getInfo() {
        return "[" + this.hashCode() + "(" + this.getClass() + ")] ";
    }

}
