package mh.creational.factory.factoryMethod;

public class CarFactory extends VehicleFactory {

	@Override
	Vehicle createVehicle() {
		return new Car();
	}

}
