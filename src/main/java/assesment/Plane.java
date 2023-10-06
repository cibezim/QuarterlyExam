package assesment;

public class Plane extends Vehicle implements Flyable {
    public Plane(int speed, float price, Engine engine, String name) {
        super(speed, price, engine, name);
    }

    @Override
    public Boolean transportsPassengers() {
        return true;
    }
}
