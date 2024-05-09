package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double clockIn;
    private double punchInTime;
    private double punchOutTime;
    LocalTime startClock;

    public Employee() {
    }

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double Totalpay(){
        return payRate*hoursWorked;
    }
    public double getRegularHours(){
        if(hoursWorked<=40){
            return hoursWorked;
        }
        else
        {return 40;}
    }
    public double getOvertimeHours(){
        if(hoursWorked>40){
            return hoursWorked-40;
        }
        else
        {return 0;}
    }
       public void punchIn(double time){
        punchInTime=time;
    }

    public void punchOut(double timeOut){
        punchOutTime=timeOut;
        hoursWorked += (punchOutTime - punchInTime);
    }

   /* public void punchTimeCard(double timeIn, double timeOut){
        punchInTime = timeIn;
        punchOutTime = timeOut;
        hoursWorked += (punchOutTime-punchInTime);
    }*/
   public void punchIn() {
       //Changing the start time just for Demo purposes
       startClock = LocalTime.from(LocalDateTime.of(2024, 5, 7, 6, 0));
       //LocalDateTime.now();
       double hours = startClock.getHour();
       double minutes = (double) startClock.getMinute() /100;

       this.punchInTime = hours+minutes;
   }
    public void punchOut(){
        LocalDateTime endClock = LocalDateTime.now();
        double hours = endClock.getHour();
        double minutes = (double) endClock.getMinute() /100;
        punchOutTime = hours+minutes;
        hoursWorked += (punchOutTime - punchInTime);

    }


    public double getTotalPay() {
        double totalPay;
        if (getOvertimeHours()>0) {
            return (payRate * getRegularHours())+(((payRate*1.5))*getOvertimeHours());
        }
        return payRate*getRegularHours();
    }

}
