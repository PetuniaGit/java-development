package com.pluralsight;

public class SemiTruck extends Vehicle{
    protected String capacity;
    protected String engineType;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,String capacity,String engineType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.capacity = capacity;
        this.engineType = engineType;
    }
    public SemiTruck() {
    }
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


}
