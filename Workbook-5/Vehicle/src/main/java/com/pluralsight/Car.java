package com.pluralsight;

public class Car extends Vehicle{
    protected int numOfDoors;
     protected String fuelType;
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numOfDoors,String fuelType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numOfDoors = numOfDoors;
        this.fuelType = fuelType;

    }

    public Car() {
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
