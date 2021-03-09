package review_oop.oop_java_2.bai_1;

import java.util.List;

public class VehicleManager {
    List<Vehicle>vehicleList;

    public VehicleManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }
    public void showTax(){
        for (Vehicle vehicle:vehicleList) {
            System.out.println(vehicle +" ,"+ vehicle.calTax());
        }
    }
}
