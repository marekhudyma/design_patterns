package mh.structural.decorator;

import mh.structural.decorator.model.Car;
import mh.structural.decorator.model.Service;

public class FullAirConditioning implements Service {

    private Service service;

    public FullAirConditioning() {}

    public FullAirConditioning(Service service) {
        this.service = service;
    }

    @Override
    public void inspection(Car car) {
        System.out.println("full air conditioning inspection " + car);
        if(service != null) {
            service.inspection(car);
        }
    }

}
