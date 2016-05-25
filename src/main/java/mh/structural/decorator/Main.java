package mh.structural.decorator;


import mh.structural.decorator.model.Car;
import mh.structural.decorator.model.Service;

// Decorator (other name: Wrapper)
// - add to object new functionality and doesn’t change existing code
// -override target object
// - implements the same interface that target object
// Decorator can be dynamically assign to object - classic example delegation instead of inheritance
// When there is a new functionality we can:
// - extend class,
// - use delegation
// Advantages of delegation
// - can be dynamically changed,
// - we don’t have to create every combination of optional functions,
// - Decorator works like AOP (Aspect Oriented Programming)
public class Main {

	public static void main(String[] args) {
		Car car = new Car("Porsche 911");
		Service service = new FullAirConditioning(new SimpleAirConditioning());
		service.inspection(car);
	}

}
