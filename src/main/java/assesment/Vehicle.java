package assesment;

public class Vehicle extends Product {
    private int speed;
    private float price;
    private Engine engine;
    protected static final float TAX_AMT = 0.10f;


    public Vehicle(int speed, float price,Engine engine, String name) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public String getProductName() {
        return super.getProductName;
    }

    public void getSpeed() {
        getSpeed();
    }
    public void printVehicleType(this.getClass().getSimpleName());

    public float getPriceAfterTax() {
        return price + (price * TAX_AMT);
    }
}
