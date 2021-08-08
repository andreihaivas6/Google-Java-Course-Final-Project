package adapter_project.adapter;

import adapter_project.car.Car;

public class MovableAdapterImplementation implements MovableAdapter {
    private final Car car;

    public MovableAdapterImplementation(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(car.getSpeedInMPH());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.61;
    }
}