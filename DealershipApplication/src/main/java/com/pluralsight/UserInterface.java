package com.pluralsight;


public class UserInterface {
    private Dealership dealership;

    public UserInterface(){
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display(){
        for(Vehicle vehicle : dealership.getAllVehicles()){
            System.out.println(vehicle);
        }
    }

    public void processGetByPriceRequest(){
        double min = Console.PromptForDouble("Enter the minimum price of a vehicle: ");
        double max = Console.PromptForDouble("Enter the maximum price of a vehicle: ");

        dealership.getVehiclesByPrice(min, max).forEach(System.out::println);
    }

    public void processGetByMakeModelRequest(){
        String make = Console.PromptForString("Enter car company that you are looking for: ");
        String model = Console.PromptForString("Enter car model that you are looking for: ");

        dealership.getVehiclesByModel(make, model).forEach(System.out::println);
    }

    public void processGetByYearRequest(){
        int min = Console.PromptForInt("Enter the minimum year of a vehicle: ");
        int max = Console.PromptForInt("Enter the maximum year of a vehicle: ");

        dealership.getVehiclesByYear(min, max).forEach(System.out::println);
    }

    public void processGetByColorRequest(){
        String color = Console.PromptForString("Enter a color that you want the vehicle to be in: ");

        dealership.getVehiclesByColor(color).forEach(System.out::println);
    }

    public void processGetByMileageRequest(){
        int min = Console.PromptForInt("Enter the minimum mileage of a vehicle: ");
        int max = Console.PromptForInt("Enter the maximum mileage of a vehicle:: ");

        dealership.getVehiclesByMileage(min, max).forEach(System.out::println);
    }

    public void processGetByVehicleTypeRequest(){
        String type = Console.PromptForString("Enter what type of vehicle you are looking for: ");

        dealership.getVehiclesByType(type).forEach(System.out::println);
    }

    public void processGetAllVehicleRequest(){
        for(Vehicle vehicle : dealership.getAllVehicles()){
            System.out.println(vehicle);
        }
    }

    public void processAddVehicleRequest(){

    }
//
//    public void rocessRemoveVehicleRequest(){}

    public void displayAll(){
        String userChoice;
        do{
            System.out.println("Please choose from the options");
            System.out.println("Display All vehicle:[A] ");
            System.out.println("Display by Price:[P] ");
            System.out.println("Display by Company:[C] ");
            System.out.println("Display by make Year:[Y] ");
            System.out.println("Display by Millage:[M] ");
            System.out.println("Display by Car Color:[CC] ");
            System.out.println("Display by Car Type:[T] ");
            System.out.println("Enter [E] to exit");

            userChoice = Console.PromptForString("Please enter your choice: ");
            System.out.println("\n");

            switch (userChoice){
                case "A":
                    display();
                    System.out.println("\n");
                    break;
                case "P":
                    processGetByPriceRequest();
                    System.out.println("\n");
                    break;
                case "C":
                    processGetByMakeModelRequest();
                    System.out.println("\n");
                    break;
                case "Y":
                    processGetByYearRequest();
                    System.out.println("\n");
                    break;
                case "M":
                    processGetByMileageRequest();
                    System.out.println("\n");
                    break;
                case "CC":
                    processGetByColorRequest();
                    System.out.println("\n");
                    break;
                case "T":
                    processGetByVehicleTypeRequest();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("You choice does not match!!");
            }
        }while (!userChoice.equalsIgnoreCase("E"));
    }
}