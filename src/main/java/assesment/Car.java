package assesment;

public class Car extends Vehicle implements Driveable {
private int numberOfDoors;
private static final float EXTRA_TAX = 0.05f;

    public Car(int speed, float price, Engine engine, String name, int numberOfDoors) {
        super(speed, price, engine, name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors
    }

    @Override
    public void printSpeed() {

    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getSpeed();
    }

    public float getPriceAfterExtraTax() {
        return getPriceAfterTax() + (getPriceAfterTax() * EXTRA_TAX);
    }
}
