package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public List<Vehicles> vehicles;
    private String fileName;

    public DealerShip() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicles Vehicles) {
        vehicles.add(Vehicles);
    }

    public void removeVehicle(Vehicles Vehicles) {
        vehicles.remove(Vehicles);
    }

    public void listAllVehicles() {
        for (Vehicles v : vehicles) {
            System.out.println(v);
        }
    }

    public void findVehiclesByPrice(double minPrice, double maxPrice) {
        for (Vehicles v : vehicles) {
            if (v.getPrice() >= minPrice && v.getPrice() <= maxPrice) {
                System.out.println(v);
            }
        }
    }

    public void findVehiclesByMakeModel(String make, String model) {
    }

    public void findVehiclesByYearRange(int minYear, int maxYear) {
    }

    public void findVehiclesByColor(String color) {
    }

    public void findVehiclesByMileageRange(int minMileage, int maxMileage) {
    }

    public void findVehiclesByType(String type) {
    }

    public void findVehicleByMakeModel(String make, String model) {
    }
}
