package com.pluralsight;

public class Reservations {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservations(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double price;
        if (this.getRoomType().equalsIgnoreCase("king")) {
            price = 139;
        } else if (this.getRoomType().equalsIgnoreCase("double")) {
            price = 129;
        } else {
            throw new Exception("Error");
        }
        if (this.isWeekend()) {
            price *= 1.1;
        }
        return price;
    }


public int getNumberOfNights(){
        return this.numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend(){
        return this.isWeekend;
    }
    public void setIsWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }
    public double getReservationTotal() throws Exception{
        return this.getPrice() *this.getNumberOfNights();

    }
}
