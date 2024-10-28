package com.pluralsight;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            DealerShip dealership = new DealerShip();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("1 - Find vehicles within a price range");
                System.out.println("2 - Find vehicles by make / model");
                System.out.println("7 - List ALL vehicles");
                System.out.println("8 - Add a vehicle");
                System.out.println("9 - Remove a vehicle");
                System.out.println("99 - Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter minimum price: ");
                        double minPrice = scanner.nextDouble();
                        System.out.print("Enter maximum price: ");
                        double maxPrice = scanner.nextDouble();
                        dealership.findVehiclesByPrice(minPrice, maxPrice);
                        break;
                    case 2:
                        System.out.print("Enter make: ");
                        String make = scanner.next();
                        System.out.print("Enter model: ");
                        String model = scanner.next();
                        dealership.findVehiclesByMakeModel(make, model);
                        break;
                    case 7:
                        dealership.listAllVehicles();
                        break;
                    case 8:
                        System.out.print("Enter make: ");
                        String newMake = scanner.next();
                        System.out.print("Enter model: ");
                        String newModel = scanner.next();
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
                        Vehicles newVehicle = new Vehicles(newMake, newModel, year, price, color, mileage, type);
                        dealership.addVehicle(newVehicle);
                        break;
                    case 9:
                        System.out.print("Enter make of the vehicle to remove: ");
                        String removeMake = scanner.next();
                        System.out.print("Enter model of the vehicle to remove: ");
                        String removeModel = scanner.next();
                        Vehicles vehicleToRemove = null;
                        for (Vehicles v : dealership.vehicles) {
                            if (v.getMake().equalsIgnoreCase(removeMake) && v.getModel().equalsIgnoreCase(removeModel)) {
                                vehicleToRemove = v;
                                break;
                            }
                        }
                        if (vehicleToRemove != null) {
                            dealership.removeVehicle(vehicleToRemove);
                            System.out.println("Vehicle removed.");
                        } else {
                            System.out.println("Vehicle not found.");
                        }
                        break;
                    case 99:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 99);

            scanner.close();
        }
    }

