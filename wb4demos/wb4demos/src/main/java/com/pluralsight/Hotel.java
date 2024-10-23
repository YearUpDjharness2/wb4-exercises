package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedRooms;

    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite)
        {
            if( numberOfRooms > getAvailableSuites()){
                return false;
            }
            else //we have the space
            {
                bookedSuites += numberOfRooms;
                return true;
            }
        }
        else // is not a suite
        {
            if( numberOfRooms > getAvailableRooms() ){
                return false;
            }
            else //we have the space
            {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return numberOfRooms - bookedBasicRooms;
    }




}
