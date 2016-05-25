package mh.behavioral.strategy;

import mh.behavioral.strategy.airconditioning.NoneAirconditioningCheck;
import mh.behavioral.strategy.wheels.FullWheelsCheck;

// Strategy
// define family of algorithms that can be replaces, encapsulate it in the class.
// You can replace the algorithm during execution of application. Client doesn’t know about it.
// if (carFromEU) car = new Car(new WithoutRegistration());
// else car = new Car(new RegisterCar())
//
// Advantages of Strategy:
// -You don’t have to inherit classes, composition over inheritance, you don’t change code.
// -Don’t copy code
public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService(new NoneAirconditioningCheck(), new FullWheelsCheck());
        carService.check(new Car());
    }
}
