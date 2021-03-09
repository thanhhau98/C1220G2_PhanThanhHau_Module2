package review_oop.oop_java_2.bai_1;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {

        VehicleManager vehicleManager = new VehicleManager(new ArrayList<>());
        Vehicle vehicle = new Vehicle("suzuki", 80, 150);
        Vehicle vehicle1 = new Vehicle("yamaha", 100, 80);
        vehicleManager.addVehicle(vehicle);
        vehicleManager.addVehicle(vehicle1);
        vehicleManager.showTax();
    }
}
