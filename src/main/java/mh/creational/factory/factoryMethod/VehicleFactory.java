package mh.creational.factory.factoryMethod;

public abstract class VehicleFactory {

	abstract Vehicle createVehicle();
	
	public Vehicle prepairVehicle() {
		Vehicle vehicle = createVehicle();
		vehicle.checkLiquids();
		vehicle.changeBattery();
		vehicle.refuel();
		return vehicle;
	}

}
