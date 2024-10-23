package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Widget w = new Widget("blue");
        w.DoSomething();



        System.out.println("Hello world!");


        Car c = new Car("Jeep","CJ-7");
        c.accelerate(5);
        c.accelerate(10);
        c.brake(3);
        System.out.println(c.getSpeed());

    }
}
