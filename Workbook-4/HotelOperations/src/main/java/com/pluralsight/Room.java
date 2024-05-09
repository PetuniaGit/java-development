package com.pluralsight;

public class Room {

    private int NumberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
      private String cleanroom;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        NumberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable(){
        if(!isOccupied && !isDirty) {
           return true;
        }
        return false;
    }
    public void checkIn() {
        isOccupied=true;
        isDirty=true;

    }
    public void checkOut() {
        isOccupied=false;
    }
    public void cleanroom(){
        isDirty=true;
    }
}
