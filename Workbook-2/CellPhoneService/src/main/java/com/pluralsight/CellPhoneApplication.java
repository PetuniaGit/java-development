package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        CellPhone cp1=new CellPhone(0," "," ",0," ");
        System.out.println("what is the serial number?");
        long sn=scan.nextLong();
        cp1.setSerialnumber(sn);
        System.out.println("what is the model?");
        String model=scan.nextLine();
        cp1.setModel(model);
        scan.nextLine();
        System.out.println("what is the carrier?");
        String carrier=scan.nextLine();
        cp1.setCarrier(carrier);
        System.out.println("what is your phone number?");
         long phonenumber=scan.nextLong();
         cp1.setPhoneNumber( phonenumber);
        System.out.println("who is the owner?");
        String owner=scan.nextLine();
        cp1.setOwner(owner);
        scan.nextLine();

        System.out.println( "\n Cell phone details: ");
        System.out.println("Serial Number :" + cp1.getSerialnumber());
        System.out.println( "Model :" + cp1.getModel());
        System.out.println("Carrier :" + cp1.getCarrier());
        System.out.println( "Phone Number ;" +cp1.getPhoneNumber());
        System.out.println( "Owner :"+ cp1.getOwner());


    }
}
