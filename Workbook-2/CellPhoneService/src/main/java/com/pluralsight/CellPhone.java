package com.pluralsight;

import java.sql.SQLOutput;

public class CellPhone {
    private long serialnumber;
    private String Model;
    private String carrier;
    private long phoneNumber;
    private String Owner;
    public CellPhone( long serialnumber, String Model, String carrier, long phoneNumber,String Owner) {
        this.serialnumber=serialnumber;
        this.Model=Model;
        this.carrier=carrier;
        this.phoneNumber=phoneNumber;
        this.Owner=Owner;

    }
    public void setSerialnumber(long serialnumber){
        this.serialnumber=serialnumber;
    }
    public void setModel(String model){
        this.Model=model;
    }
    public void setCarrier(String carrier){
        this.carrier=carrier;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setOwner(String owner){
        this.Owner=Owner;
    }

    public long getSerialnumber(){
      return  serialnumber;
    }
    public String getModel(){
       return Model;
    }
    public String getCarrier(){
      return  carrier;
    }
    public long getPhoneNumber(){
       return phoneNumber;
    }
    public String getOwner(){
       return Owner;
    }
    public void dial ( long phoneNumber ) {
        System.out.println( Owner+ "'s phone is calling "+ phoneNumber);
    }

}
