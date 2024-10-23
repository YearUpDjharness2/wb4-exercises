
package com.pluralsight;

public class Rooms {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Rooms(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }
    public double getPrice(){
        return  this.price;
    }
    public boolean isDirty(){
        return this.dirty;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isAvailable() {
        return ( !this.isDirty() && !this.isOccupied() );
    }

    public void checkIn3(){
        if( !dirty && !occupied){
            occupied = true;
            dirty = true;
        }
        else if (dirty){
            System.out.println("Cannot check into a dirty room.");
        }
        else if (occupied){
            System.out.println("Cannot check into a room that is already occupied");
        }
    }
    public void checkOut3(){
        if(occupied){
            occupied = false;
        }
        else{
            System.out.println("Cannot check out of an unoccupied room!");
        }

    }
    public void cleanRoom3(){
        dirty = false;
    }

    public void checkIn2(){
        occupied = true;
        dirty = true;
    }
    public void checkOut2(){
        occupied = false;
    }
    public void cleanRoom2(){
        dirty = false;
    }


    public void checkIn(){
        if (occupied == false && dirty == false){
            System.out.println("Checked In successfully");
            occupied = true;
            dirty = true;
        }  else System.out.println("Cannot check in! The room is either occupied or not cleaned.");
    }
    public void checkOut(){
        if (occupied == true && dirty == true){

            System.out.println("Checked Out successfully");
            occupied = false;
            dirty = true;
        }  else System.out.println("Cannot check out! The room was either not occupied or not cleaned.");
        cleanRoom();
    }
    public void cleanRoom(){
        dirty = false;
        System.out.println("the room is clean now! ");
    }
    public void resetRoom(){
        occupied = false;
        dirty = false;
        System.out.println("The room has been reset to ready state by admin.");
    }

}

