package com.pluralsight;

public class Vehicles {
    private double Price;
    private String Make;
    private String Model;
    private int Year;
    private String Color;
    private int Mileage;
    private String Type;

    public Vehicles(String make, String model, int year, double price,String color, int mileage, String type){
        this.Make = make;
        this.Model = model;
        this.Year = year;
        this.Color = color;
        this.Mileage = mileage;
        this.Type = type;
    }
    public String getMake() {
        return Make;}
    public String getModel(){
        return Model;}
    public int getYear(){
        return Year;}
    public double getPrice(){
        return Price;}
    public String getColor(){
        return Color;}
    public int getMileage(){
        return Mileage;}
    public String getType(){
        return Type;}

    @Override
    public String toString(){
        return Year + " " + Make +  " " + Model + " - " + Color +  " ,$" + Mileage + " Miles, Type: " + Type;
    }


}
