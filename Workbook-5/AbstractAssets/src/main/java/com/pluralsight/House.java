package com.pluralsight;

public class House extends Asset{
    protected String address;
    protected int condition;
    protected int squareFoot;
    protected int lotSize;
    protected double price;
    public House(String description, String dateAcquired, double originalCost,String address,int condition,int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
     @Override
     public double getValue() {

             switch (condition) {
                 case 1:
                     price = 180.00 * squareFoot;
                     break;
                 case 2:
                     price = 130.00 * squareFoot;
                     break;
                 case 3:
                     price = 90.00 * squareFoot;
                     break;
                 case 4:
                     price = 80.00 * squareFoot;
                     break;
                 default:
                     System.out.println("Invalid condition");
             }
             price += 0.25 * lotSize;
             return price;

    }

}
