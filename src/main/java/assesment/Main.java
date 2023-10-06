package assesment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle mustang = new Car(200, 50000, new Engine(Size.MEDIUM), "Mustang", 2);
        Vehicle concord = new Airplane(900, 50000000, new Engine(Size.LARGE), "Concord", 4);
        Vehicle seaHorse = new Boat(30, 20000, new Engine(Size.SMALL), "SeaHorse", false);
        Vehicle gm = new Car(180, 40000, new Engine(Size.MEDIUM), "GM", 4);
        Vehicle m2 = new Motorcycle(150, 12000, new Engine(Size.SMALL), "M2");


        Drone drone = new Drone("Delivery Drone");
        FlyingCar flyingCar = new FlyingCar(250, 80000, new Engine(Size.LARGE), "SkyCar", "https://www.cnn.com/2023/07/03/tech/flying-car-faa/index.html");


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(mustang);
        vehicles.add(concord);
        vehicles.add(seaHorse);
        vehicles.add(gm);
        vehicles.add(m2);


        VehicleApp vehicleApp = new VehicleApp();
        System.out.println("Vehicle Names:");
        vehicleApp.printListOfVehicleNames(vehicles);


        List<Flyable> flyableObjects = new ArrayList<>();
        flyableObjects.add(drone);
        flyableObjects.add(flyingCar);


        System.out.println("\nFlyable Objects:");
        vehicleApp.printListOfFlyableObjects(flyableObjects);
    }
}
