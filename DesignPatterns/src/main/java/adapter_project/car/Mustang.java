package adapter_project.car;

public class Mustang extends Car {

    public Mustang(String name) {
        super(name);
    }

    @Override
    public double getSpeedInMPH() {
        return 130;
    }
}
