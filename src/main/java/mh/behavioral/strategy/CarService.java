package mh.behavioral.strategy;

import mh.behavioral.strategy.airconditioning.AirconditioningCheck;
import mh.behavioral.strategy.wheels.WheelsCheck;

public class CarService {

    private AirconditioningCheck airconditioningCheck;

    private WheelsCheck wheelsCheck;

    public CarService(final AirconditioningCheck airconditioningCheck, final WheelsCheck wheelsCheck) {
        this.airconditioningCheck = airconditioningCheck;
        this.wheelsCheck = wheelsCheck;
    }

    public void check(Car car) {
        airconditioningCheck.inspection(car);
        wheelsCheck.inspection(car);
    }

}
