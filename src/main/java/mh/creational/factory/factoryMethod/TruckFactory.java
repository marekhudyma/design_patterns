package mh.creational.factory.factoryMethod;

public class TruckFactory extends VehicleFactory {

	@Override
	Vehicle createVehicle() {
		return new Truck();
	}

}
