package assesment;

public class Truck extends Vehicle implements Driveable {
    public Truck(int speed, float price, Engine engine, String name) {
        super(speed, price, engine, name);
    }

    @Override
    public void printSpeed() {

    }

    @Override
    public void printSpeed(Vehicle vehicle) {

    }
}
