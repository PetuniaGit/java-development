package com.pluralsight;

public class CellPhone {
    private long serialnumber;
    private String model;
    private String carrier;
    private long phoneNumber;
    private String owner;
    public CellPhone( long serialnumber, String model, String carrier, long phoneNumber,String owner) {
        this.serialnumber=serialnumber;
        this.model=model;
        this.carrier=carrier;
        this.phoneNumber=phoneNumber;
        this.owner=owner;

    }
    public void setSerialnumber(long serialnumber){
        this.serialnumber=serialnumber;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setCarrier(String carrier){
        this.carrier=carrier;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }

    public long getSerialnumber(){
      return  serialnumber;
    }
    public String getModel(){
       return model;
    }
    public String getCarrier(){
      return  carrier;
    }
    public long getPhoneNumber(){
       return phoneNumber;
    }
    public String getOwner(){
       return owner;
    }


}
