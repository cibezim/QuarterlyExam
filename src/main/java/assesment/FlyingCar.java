package assesment;

public class FlyingCar extends Vehicle implements Flyable, Driveable {
    private String articleUrl = https://www.cnn.com/2023/07/03/tech/llying-car-faa/index.html;


    public FlyingCar(int speed, float price, Engine engine, String name, String articleUrl) {
        super(speed, price, engine, name);
        this.articleUrl = articleUrl;
    }


    @Override
    public void printSpeed() {

    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println("The speed of the flying car is:" + vehicle.getSpeed());
    }

    @Override
    public Boolean transportsPassengers() {
        return true;
    }
    public void whatIsAFlyingCar() {
        System.out.println("What is a flying car?"+ "Check this out: https://www.cnn.com/2023/07/03/tech/llying-car-faa/index.html");
}
}
