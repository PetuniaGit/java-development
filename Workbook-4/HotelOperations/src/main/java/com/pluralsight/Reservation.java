package com.pluralsight;

public class Reservation {
    private String Roomtype;
    private int NumberofNights;
    private boolean isWeekend;
    private  double price;
    public Reservation(String roomtype, int numberofNights, boolean isWeekend) {
        Roomtype = roomtype;
        NumberofNights = numberofNights;
        this.isWeekend = isWeekend;
    }
    public String getRoomtype() {
        return Roomtype;
    }

    public void setRoomtype(String roomtype) {
        Roomtype = roomtype;
    }

    public int getNumberofNights() {
        return NumberofNights;
    }

    public void setNumberofNights(int numberofNights) {
        NumberofNights = numberofNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

  public double getPrice(){

        if (Roomtype.equals("king")){
            return price=139.00;
        }
else{
      return price=124.00;}
  }
  public double getReservationTotal(){
        if (isWeekend){
        return price*NumberofNights;}
        else{
            return (price+price*0.1)*NumberofNights;
        }
  }

}
