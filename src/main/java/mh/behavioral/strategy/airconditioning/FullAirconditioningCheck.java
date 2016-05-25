package mh.behavioral.strategy.airconditioning;

import mh.behavioral.strategy.Car;

public class FullAirconditioningCheck implements AirconditioningCheck{

    @Override
    public void inspection(Car car) {
        System.out.println("full air inspection " + car);
    }

}
