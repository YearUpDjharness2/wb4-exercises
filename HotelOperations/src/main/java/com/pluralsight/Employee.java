package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
    private double punchIn;


    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchIn = -1;
    }

    public double getTotalPay(){
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return getRegularHours() * payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours() * payRate * 1.5;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;

    }


    public float getOvertimeHours(){
        return (hoursWorked > 40 ) ? hoursWorked - 40 : 0 ;
    }

    public void punchIn(double time){
        if(punchIn == -1){
            punchIn = time;
            System.out.println(name + "Punched in at:" + time);
        } else {
            System.out.println(name + "Is already punched in.");
        }
    }
    public void punchOut(double time){
        if (punchIn !=-1){
            double hoursWorkedThisShift = time - punchIn;
            if (hoursWorkedThisShift > 0){
                System.out.println(name + "Punched out at: " + time + ". Hours worked this session: " + hoursWorkedThisShift);
            } else {
                System.out.println("Invalid punch out time. Must be greater than punch in time.");
            }
            punchIn = -1;
        } else {
            System.out.println(name + "hasn't been punched in");
        }

    }


}