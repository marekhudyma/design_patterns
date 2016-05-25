package mh.structural.decorator;

import mh.structural.decorator.model.Car;
import mh.structural.decorator.model.Service;

public class SimpleAirConditioning implements Service {

	private Service service;

	public SimpleAirConditioning() {}

	public SimpleAirConditioning(Service service) {
		this.service = service;
	}

	@Override
	public void inspection(Car car) {
		System.out.println("simple air conditioning inspection " + car);
		if(service != null) {
			service.inspection(car);
		}
	}

}
