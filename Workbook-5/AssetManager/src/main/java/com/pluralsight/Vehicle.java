package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle extends Asset {
    protected String makeModel;
    protected int year;
    protected int odometer;
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    public double getValue() {
        LocalDate ldt=LocalDate.now();
        int x=ldt.getYear();
       int yeardifference=x-year;
             double price;

        if (yeardifference <= 3) {
            price = getOriginalCost() - (getOriginalCost()*0.03);
        } else if (yeardifference <= 6) {
            price = getOriginalCost() *(getOriginalCost()*0.06);
        } else if (yeardifference <= 10) {
            price = getOriginalCost() * (getOriginalCost()*0.08);
        } else {
            price = getOriginalCost()-1000.00;
        }
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            price *= 0.75;
        }
        return price;
    }
}
