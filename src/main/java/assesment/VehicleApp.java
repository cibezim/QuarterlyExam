package assesment;

import java.util.*;

public class VehicleApp {

    public void printListOfVehicleNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getProductName());
        }

        public void printListOfFlyableObjects(List<Flyable> flyables) {
            for (Flyable flyable : flyables) {
                System.out.println(flyables.trasportsPassengers());
            }
    public void sortAbdPrintDriveableVehiclesBySpeed(List<Driveable> driveables) {
                Collections.sort(driveables, Comparator.comparingInt(v -> ((Vehicle) v).getSpeed()));

                for (Driveable driveable : driveables)
                    System.out.println((Vehicle) drive);
}
