package com.pluralsight;

import java.util.Scanner;

public class AddressBulider {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your full name?");
        String Fullname= scan.nextLine();

        System.out.println(" what is your billing street?");
        String billingstreet=scan.nextLine();
        System.out.println("what is your billing city?");
        String billingcity=scan.nextLine();
        System.out.println("What is your state ?");
        String billingstate= scan.nextLine();
        System.out.println("what is your billing Zip?");
        String billingzip=scan.nextLine();
        StringBuilder fullname= new StringBuilder();
        fullname.append(Fullname);
        StringBuilder BillingA= new StringBuilder();


        BillingA.append(billingstreet+"\n");
        BillingA.append(" "+billingcity);
        BillingA.append(" "+billingstate);
        BillingA.append(" "+billingzip);

        String MyBillingA= BillingA.toString();

        System.out.println("What is your shipping street?");
        String shippingstreet= scan.nextLine();
        System.out.println(" what is your shipping city?");
        String shippingcity=scan.nextLine();
        System.out.println("what is your shipping state?");
        String shippingstate=scan.nextLine();
        System.out.println("what is your shipping Zip?");
        String shippingzip=scan.nextLine();

        StringBuilder ShippingA= new StringBuilder();
        ShippingA.append(shippingstreet + "\n");
        ShippingA.append(" "+shippingcity);
        ShippingA.append(" "+shippingstate);
        ShippingA.append(" "+ shippingzip);

        String MyShippingA=ShippingA.toString();
        System.out.println(fullname);
        System.out.println("Billing Address :" + MyBillingA);
        System.out.println("Shipping Address :" + MyShippingA);
    }
}
