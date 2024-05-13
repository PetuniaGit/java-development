package com.pluralsight;

public class VehicleDriver {
    public static void main(String[] args) {
        Moped moped1=new Moped();
        moped1.setColor("red");
        moped1.setFuelCapacity(6);

        Car car1=new Car();
        car1.setCargoCapacity(5);
        car1.setColor("green");

        SemiTruck semiT=new SemiTruck();
        semiT.setNumberOfPassengers(20);
        semiT.setFuelCapacity(10);

        HoverCraft hover= new HoverCraft();
        hover.setLiftPower(100);
        hover.setNumberOfPassengers(1);

    }
}
