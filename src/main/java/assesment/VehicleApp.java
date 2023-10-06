package assesment;

import java.util.*;

public class VehicleApp {
    public void printListOfVehicleNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getProductName());
        }
    }

    public void printListOfFlyableObjects(List<Flyable> flyables) {
        for (Flyable flyable : flyables) {
            System.out.println(flyable.transportsPassengers());
        }
    }

    public void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> driveables) {
        Collections.sort(driveables, Comparator.comparingInt(v -> ((Vehicle) v).getSpeed()));

        for (Driveable driveable : driveables) {
            System.out.println( (Vehicle) driveable).getSpeed();
        }
    }

    public void printPassengerNumbersOnly(Map<Integer, String> passengers) {
        for (Map.Entry<Integer, String> entry : passengers.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

