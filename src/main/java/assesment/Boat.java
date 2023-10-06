package assesment;

public class Boat extends Vehicle implements Driveable {
    public Boat(int speed, float price, Engine engine, String name) {
        super(speed, price, engine, name);
        this.hasGPS = hasGPS;
    }

    private boolean hasGPS() {
        return hasGPS();
    }

    public void printGpsInfo() {
        System.out.println(hasGPS());
    }

    @Override
    public void printSpeed() {
        vehicle.getSpeed();
    }
}


