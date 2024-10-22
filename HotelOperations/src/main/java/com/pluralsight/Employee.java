package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            double overtimePay = 40 * payRate;
            double regularPay = overtimeHours * payRate * 1.5;
            return regularPay + overtimePay;
        }
        else {
            return this.payRate * this.hoursWorked;
        }
    }

    public float getRegularHours() {
        return 0;
    }

    public float getOvertimeHours() {
        return 0;
    }
}