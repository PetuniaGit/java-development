package com.pluralsight;

public class Employee {
    private int employeeId;


    private String name;
    private double hoursworked;
    private double payRate;


    public Employee(int employeeId, String name, double hoursworked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursworked = hoursworked;
        this.payRate = payRate;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay(){
        return hoursworked*payRate;
    }
}
