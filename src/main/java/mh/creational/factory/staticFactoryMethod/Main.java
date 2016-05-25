package mh.creational.factory.staticFactoryMethod;

// Static factory method doesn’t have public constructors
// class has set of public static methods, that return object of this class (or class that extends)
// Popular method names:
//   getInstance
//   newInstance
//   valueOf
//   get<Type>
// Simple implementation:
// public static Product getInstance() {
//   return new Product();
// }
public class Main {

    public static void main(String[] args) {
        CarFactory.createCar();
    }

}
