package com.pluralsight;

public class Moped extends Vehicle{
 protected int maxSpeed;



    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxSpeed) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxSpeed = maxSpeed;
    }

    public Moped() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
