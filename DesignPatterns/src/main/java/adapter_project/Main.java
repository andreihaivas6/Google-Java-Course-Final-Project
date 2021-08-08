package adapter_project;

import adapter_project.adapter.MovableAdapter;
import adapter_project.adapter.MovableAdapterImplementation;
import adapter_project.car.Car;
import adapter_project.car.Mercedes;
import adapter_project.car.Mustang;

public class Main {
    public static void main(String[] args) {
        Car mustang = new Mustang("Mustang GT");
        Car mercedes = new Mercedes("Mercedes AMG");

        MovableAdapter mustangAdapter = new MovableAdapterImplementation(mustang);
        MovableAdapter mercedesAdapter = new MovableAdapterImplementation(mercedes);

        double differenceBetweenMustangAndMercedesInMPH = mustang.getSpeedInMPH() - mercedes.getSpeedInMPH();
        System.out.println(mustang + " is faster than " + mercedes + " with " +
                differenceBetweenMustangAndMercedesInMPH + " MPH.");

        double differenceBetweenMustangAndMercedesInKMH = mustangAdapter.getSpeed() - mercedesAdapter.getSpeed();
        System.out.println(mustang + " is faster than " + mercedes + " with " +
                differenceBetweenMustangAndMercedesInKMH + " KMPH.");
    }
}
