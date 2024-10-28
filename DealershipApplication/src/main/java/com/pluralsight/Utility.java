package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Utility {
    private DealerShip dealership;

    public Utility(DealerShip dealership) {
        this.dealership = dealership;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> processGetByPriceRequest(scanner);
                case 2 -> processGetByMakeModelRequest(scanner);
                case 3 -> processGetByYearRequest(scanner);
                case 4 -> processGetByColorRequest(scanner);
                case 5 -> processGetByMileageRequest(scanner);
                case 6 -> processGetByVehicleTypeRequest(scanner);
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest(scanner);
                case 9 -> processRemoveVehicleRequest(scanner);
                case 99 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 99);

        scanner.close();
    }

    private void processGetByPriceRequest(Scanner scanner) {
        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();
        dealership.findVehiclesByPrice(minPrice, maxPrice);
    }

    private void processGetByMakeModelRequest(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
        dealership.findVehiclesByMakeModel(make, model);
    }

    private void processGetByYearRequest(Scanner scanner) {
        System.out.print("Enter minimum year: ");
        int minYear = scanner.nextInt();
        System.out.print("Enter maximum year: ");
        int maxYear = scanner.nextInt();
        dealership.findVehiclesByYearRange(minYear, maxYear);
    }

    private void processGetByColorRequest(Scanner scanner) {
        System.out.print("Enter color: ");
        String color = scanner.next();
        dealership.findVehiclesByColor(color);
    }

    private void processGetByMileageRequest(Scanner scanner) {
        System.out.print("Enter minimum mileage: ");
        int minMileage = scanner.nextInt();
        System.out.print("Enter maximum mileage: ");
        int maxMileage = scanner.nextInt();
        dealership.findVehiclesByMileageRange(minMileage, maxMileage);
    }

    private void processGetByVehicleTypeRequest(Scanner scanner) {
        System.out.print("Enter vehicle type (car, truck, SUV, van): ");
        String type = scanner.next();
        dealership.findVehiclesByType(type);
    }

    private void processGetAllVehiclesRequest() {
        dealership.listAllVehicles();
    }

    private void processAddVehicleRequest(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.next();
        System.out.print("Enter model: ");
        String model = scanner.next();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter color: ");
        String color = scanner.next();
        System.out.print("Enter mileage: ");
        int mileage = scanner.nextInt();
        System.out.print("Enter type (car, truck, SUV, van): ");
        String type = scanner.next();

        Vehicles newVehicle = new Vehicles(make, model, year, price, color, mileage, type);
        dealership.addVehicle(newVehicle);
    }

    private void processRemoveVehicleRequest(Scanner scanner) {
        System.out.print("Enter make of the vehicle to remove: ");
        String make = scanner.next();
        System.out.print("Enter model of the vehicle to remove: ");
        String model = scanner.next();

        Vehicles vehicleToRemove = dealership.findVehicleByMakeModel(make, model);
        if (vehicleToRemove != null) {
            dealership.removeVehicle(vehicleToRemove);
            System.out.println("Vehicle removed.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }
}
