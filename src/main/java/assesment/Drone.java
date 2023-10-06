package assesment;

public class Drone implements Flyable {
   private String name;

    public Drone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Boolean transportsPassengers() {
        return false;
    }
}
