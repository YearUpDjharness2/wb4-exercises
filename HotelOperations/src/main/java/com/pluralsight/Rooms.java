package com.pluralsight;

public class Rooms {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Rooms(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        return (!this.isDirty() && !this.isOccupied());
    }

    public void checkIn() {
        if (this.isAvailable()) {
            this.occupied = true;
            this.dirty = true;  
            System.out.println("Checked into the room.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }
      public void checkOut() {
        if (this.isOccupied()) {
            this.occupied = false;
            System.out.println("Checked out of the room. It now needs to be cleaned.");
        } else {
            System.out.println("Cannot check out. The room is not currently occupied.");
      }
    }

    public void cleanRoom() {
        if (this.isDirty()) {
            this.dirty = false;
            System.out.println("The room has been cleaned.");
        } else {
            System.out.println("The room is already clean.");
        }
    }
}

