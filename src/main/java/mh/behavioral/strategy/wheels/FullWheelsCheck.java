package mh.behavioral.strategy.wheels;

import mh.behavioral.strategy.Car;

public class FullWheelsCheck implements WheelsCheck {

    @Override
    public void inspection(Car car) {
        System.out.println("full wheels inspection " + car);
    }

}
