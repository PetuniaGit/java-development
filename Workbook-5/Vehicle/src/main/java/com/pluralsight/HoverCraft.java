package com.pluralsight;

public class HoverCraft extends Vehicle {

    protected int liftPower;
    protected String propeller;
    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int liftPower, String propeller) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.liftPower = liftPower;
        this.propeller = propeller;
    }

    public HoverCraft() {
    }

    public int getLiftPower() {
        return liftPower;
    }

    public void setLiftPower(int liftPower) {
        this.liftPower = liftPower;
    }

    public String getPropeller() {
        return propeller;
    }

    public void setPropeller(String propeller) {
        this.propeller = propeller;
    }


}
