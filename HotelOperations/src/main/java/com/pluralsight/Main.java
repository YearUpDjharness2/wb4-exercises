package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Employee e1 = new Employee(1, "david","tech", 10,40);
        double totalPay =e1.getTotalPay();
        System.out.println(e1.getRegularHours());
        System.out.println(e1.getOvertimeHours());
    }
}