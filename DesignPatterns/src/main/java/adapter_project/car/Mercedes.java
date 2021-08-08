package adapter_project.car;

public class Mercedes extends Car {

    public Mercedes(String name) {
        super(name);
    }

    @Override
    public double getSpeedInMPH() {
        return 120;
    }
}

