package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public List<Vehicles> vehicles;
    private String fileName;
    public DealerShip(){
        this.vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicles Vehicles){
        vehicles.add(Vehicles);
    }
    public void removeVehicle(Vehicles Vehicles){
        vehicles.remove(Vehicles);
    }
    public void listAllVehicles(){
        for (Vehicles v : vehicles){
            System.out.println(v);
        }
    }
    public void findVehiclesByPrice(double minPrice, double maxPrice){
        for (Vehicles v : vehicles){
            if (v.getPrice() >= minPrice && v.getPrice() <= maxPrice){
                System.out.println(v);
            }
        }
    }

    public void findVehiclesByMakeModel(String make, String model) {
    }
}